package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.exception.ResourceNotFoundException;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.services.KnowledgeService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Марсель on 14.10.2017.
 */
@RestController
@RequestMapping(value = "knowledge")
public class KnowledgeController {
    @Autowired
    private KnowledgeService knowledgeService;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public KnowledgeEntity findById(@PathVariable("id") Integer id){
        try {
            return knowledgeService.findById(id);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    @RequestMapping(value = "/createKnowledge", method = RequestMethod.POST)
    public KnowledgeEntity createKnows(@RequestBody KnowledgeEntity knowledgeEntity){
        try {
            return knowledgeService.createKnows(knowledgeEntity);
        }catch (DbEntityNotFoundException e){
            throw  new ResourceNotFoundException(e.getMessage());
        }

    }

    @RequestMapping(value = "/updateKnowledge", method = RequestMethod.POST)
    public KnowledgeEntity updateKnows(@RequestBody KnowledgeEntity knowledgeEntity){
        try {
            return knowledgeService.updateKnows(knowledgeEntity);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }

    }

    @RequestMapping(value = "/deleteKnowledge/{idKnows}", method = RequestMethod.GET)
    public void deleteKnows(@PathVariable("idKnows") Integer idKnows){
        try {
            knowledgeService.deleteKnows(idKnows);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}
