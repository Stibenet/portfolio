package ru.ugrasu.portfolio.models.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.ExperienceWorkEntity;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.ExperienceRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Марсель on 21.11.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExperienceServiceTest {

    @Mock
    ExperienceRepository experienceRepository;

    @InjectMocks
    ExperienceService experienceService;

    @Test
    public void findById() throws Exception {
        //prepare
        ExperienceWorkEntity e = new ExperienceWorkEntity();
        e.setId(1);
        e.setCity("Khanty-Mansyisk");
        e.setCompany("Yugoria");
        e.setJobVacancy("Junior developer on C#");
        e.setTermWork("3 Month");

        when(experienceRepository.findOne(e.getId())).thenReturn(e);

        //testing
        ExperienceWorkEntity returned = experienceService.findById(1);

        //validate
        assertEquals(e.getId(), returned.getId());
    }
    @Test(expected = DbEntityNotFoundException.class)
    public void findByIdMustReturnRunTimeException() throws DbEntityNotFoundException {
        when(experienceRepository.findOne(Integer.MIN_VALUE)).thenReturn(null);
        experienceService.findById(Integer.MIN_VALUE);
    }
}
