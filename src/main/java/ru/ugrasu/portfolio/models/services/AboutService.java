package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.AboutRepository;

/**
 * Created by Марсель on 16.11.2017.
 */
@Service
public class AboutService {
    @Autowired
    AboutRepository aboutRepository;

    public AboutMeEntity findById(int id) throws DbEntityNotFoundException {
        AboutMeEntity aboutMeEntity;
        aboutMeEntity = aboutRepository.findOne(id);
        if (aboutMeEntity == null){
            throw new DbEntityNotFoundException("About with id = " + id + "not found");
        }
        return aboutMeEntity;
    }
}
