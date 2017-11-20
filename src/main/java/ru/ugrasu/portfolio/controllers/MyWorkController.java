package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrasu.portfolio.exception.BadRequestException;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.exception.ResourceNotFoundException;
import ru.ugrasu.portfolio.models.entities.MyWorkEntity;
import ru.ugrasu.portfolio.models.services.MyWorkService;

import java.io.Console;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Марсель on 05.10.2017.
 */
@RestController
@RequestMapping(value = "work")
public class MyWorkController {
    @Autowired
    private MyWorkService myWorkService;

    @RequestMapping(value = "/findById/{id}", produces = APPLICATION_JSON_UTF8_VALUE, method = GET)
    public MyWorkEntity findById(@PathVariable("id") Integer id) {
        try {
            return myWorkService.findById(id);
        } catch (DbEntityNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}
