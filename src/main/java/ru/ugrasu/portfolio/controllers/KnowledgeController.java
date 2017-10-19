package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/findByNameKnow/{name}", produces = APPLICATION_JSON_UTF8_VALUE, method = GET)
    public List<KnowledgeEntity> findByNameKnowledge(@PathVariable("name") String name) {
        try {
            return knowledgeService.findByNameKnowledge(name);
        } catch (DbEntityNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    @RequestMapping(value = "/allKnowledge", method = RequestMethod.GET)
    public List<KnowledgeEntity> getAllBikes(){
        return knowledgeService.getAllKnowledge();
    }

    @RequestMapping(value = "/createKnowledge/{id}/{name}", method = RequestMethod.GET)
    public KnowledgeEntity createKnows(@PathVariable("id") Integer id, @PathVariable("name") String name){
        return knowledgeService.createKnows(id, name);
    }

    @RequestMapping(value = "/updateKnowledge/{id}/{name}", method = RequestMethod.GET)
    public KnowledgeEntity updateKnows(@PathVariable("id") Integer id, @PathVariable("name") String name){
        return knowledgeService.updateKnows(id, name);
    }

    @RequestMapping(value = "/deleteKnowledge/{idKnows}", method = RequestMethod.GET)
    public void deleteKnows(@PathVariable("idKnows") Integer idKnows){
        knowledgeService.deleteKnows(idKnows);
    }
}
