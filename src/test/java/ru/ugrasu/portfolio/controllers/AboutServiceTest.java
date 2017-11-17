package ru.ugrasu.portfolio.controllers;

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
 * Проверка правильности вызова метода getAll из AboutService
 */
@RunWith(MockitoJUnitRunner.class)
public class AboutServiceTest {
//    @Mock
//    private AboutService aboutService;

    @Mock
    private AboutRepository aboutRepository;

    @InjectMocks
    private AboutService sut;

//    @InjectMocks //создает экземпляр класса контроллер AboutControllers
//            //просмотрит зависимости и инжектирует
//    AboutControllers sut; //System under testing - Система под тестированием

    @Test
    public void getAllMustReturnAllDataAboutMeEntity() throws Exception {
        //prepare
        //Когда вызывается метод getAll() необходимо что то вернуть
        //ImmutableList.of() - пустой список
        when(aboutRepository.findAll()).thenReturn(ImmutableList.of());
        //testing
        List<AboutMeEntity> returned = sut.getAll();
        //validate
        verify(aboutRepository).findAll();
    }

    @Test
    public void findByIdMustReturnAboutMeEntity() throws DbEntityNotFoundException {
        //prepare
        AboutMeEntity a = new AboutMeEntity();
        a.setIdAbout(2);
        a.setDescription("test");

        when(aboutRepository.findOne(a.getIdAbout())).thenReturn(a);
        //testing
        AboutMeEntity returnedAbout = sut.findById(2);
        //validate
        assertEquals(a.getIdAbout(), returnedAbout.getIdAbout());
    }

}