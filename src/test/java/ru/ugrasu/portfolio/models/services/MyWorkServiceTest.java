package ru.ugrasu.portfolio.models.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.entities.MyWorkEntity;
import ru.ugrasu.portfolio.models.repositories.MyWorkRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Марсель on 21.11.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class MyWorkServiceTest {

    @Mock
    private MyWorkRepository myWorkRepository;

    @InjectMocks
    private MyWorkService myWorkService;

    @Test
    public void findById() throws Exception {
        //prepare
        MyWorkEntity w = new MyWorkEntity();
        w.setIdWork(1);
        w.setDescriptionWork("test");

        when(myWorkRepository.findOne(w.getIdWork())).thenReturn(w);

        //testing
        MyWorkEntity returned = myWorkService.findById(1);

        //validate
        assertEquals(w.getIdWork(), returned.getIdWork());
    }
}