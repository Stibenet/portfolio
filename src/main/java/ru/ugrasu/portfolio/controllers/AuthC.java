package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.exception.ResourceNotFoundException;
import ru.ugrasu.portfolio.models.entities.AuthEntity;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.services.AuthS;

/**
 * Created by Марсель on 11.12.2017.
 */
@RestController
@RequestMapping(value = "auth")
public class AuthC {
    @Autowired
    private AuthS authS;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public AuthEntity findById(@PathVariable("id") Integer id){
        try {
            return authS.findById(id);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}
