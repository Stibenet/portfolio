package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
        return knowledgeService.findByNameKnowledge(name);
    }
}
