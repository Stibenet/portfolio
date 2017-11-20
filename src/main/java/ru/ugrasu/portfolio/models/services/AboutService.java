package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.repositories.AboutRepository;

import java.util.List;

/**
 * Created by Марсель on 16.11.2017.
 */
@Component
public class AboutService {
    @Autowired
    AboutRepository aboutRepository;

    public AboutMeEntity findById(int id) throws DbEntityNotFoundException {
        AboutMeEntity aboutMeEntity;
        aboutMeEntity = aboutRepository.findOne(id);
        if (aboutMeEntity == null){
            throw new DbEntityNotFoundException("Id " + id + " field 'about' not found");
        }
        return aboutMeEntity;
    }

    public List<AboutMeEntity> getAll() throws DbEntityNotFoundException {
        Iterable<AboutMeEntity> aboutMeEntity;
        aboutMeEntity = aboutRepository.findAll();
        if (aboutMeEntity == null){
            throw new DbEntityNotFoundException("Elements not found");
        }
        return (List<AboutMeEntity>) aboutRepository.findAll();
    }
}
