package ru.ugrasu.portfolio.models.services;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.repositories.AboutRepository;
import ru.ugrasu.portfolio.models.services.AboutService;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Марсель on 17.11.2017.
 * JUnit test
 * Проверка правильности вызова метода findOne из AboutService
 */
@RunWith(MockitoJUnitRunner.class)
public class AboutServiceTest {

    @Mock
    private AboutRepository aboutRepository;

    @InjectMocks
    private AboutService aboutService;

    @Test
    public void findByIdMustReturnAboutMeEntity() throws DbEntityNotFoundException {
        //prepare
        AboutMeEntity a = new AboutMeEntity();
        a.setIdAbout(2);
        a.setDescription("test");

        when(aboutRepository.findOne(a.getIdAbout())).thenReturn(a);
        //testing
        AboutMeEntity returnedAbout = null;
            returnedAbout = aboutService.findById(2);

        //validate
        assertEquals(a.getIdAbout(), returnedAbout.getIdAbout());
    }

}