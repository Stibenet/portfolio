package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.exception.ResourceNotFoundException;
import ru.ugrasu.portfolio.models.entities.ExperienceWorkEntity;
import ru.ugrasu.portfolio.models.services.ExperienceService;

/**
 * Created by Марсель on 21.11.2017.
 */
@RestController
@RequestMapping(value = "experience")
public class ExperienceController {
    @Autowired
    private ExperienceService expService;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public ExperienceWorkEntity findById(@PathVariable("id") Integer id){
        try{
            return expService.findById(id);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}
