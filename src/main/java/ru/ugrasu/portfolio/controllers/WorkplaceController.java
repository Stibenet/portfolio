package ru.ugrasu.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.exception.ResourceNotFoundException;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.entities.WorkplaceEntity;
import ru.ugrasu.portfolio.models.services.KnowledgeService;
import ru.ugrasu.portfolio.models.services.WorkplaceService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Марсель on 14.10.2017.
 */
@RestController
@RequestMapping(value = "workplace")
public class WorkplaceController {
    @Autowired
    private WorkplaceService workplaceService;

    @RequestMapping(value = "/findByNameWorkplace/{name}", produces = APPLICATION_JSON_UTF8_VALUE, method = GET)
    public List<WorkplaceEntity> findByNameWorkplace(@PathVariable("name") String name) {
        try {
            return workplaceService.findByNameWorkplace(name);
        }catch (DbEntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}
