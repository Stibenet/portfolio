package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.exception.ResourceNotFoundException;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.services.AboutService;

/**
 * Created by Марсель on 16.11.2017.
 */
@RestController
@RequestMapping(value = "about")
public class AboutControllers {
    @Autowired
    private AboutService aboutService;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public AboutMeEntity findById(@PathVariable("id") Integer id){
        try {
            return aboutService.findById(id);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}
