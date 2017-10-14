package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.entities.WorkplaceEntity;
import ru.ugrasu.portfolio.models.repositories.KnowledgeRepository;
import ru.ugrasu.portfolio.models.repositories.WorkplaceRepository;

import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Component
public class WorkplaceService {

        @Autowired
        private WorkplaceRepository workplaceRepository;

        public List<WorkplaceEntity> findByNameWorkplace(String name){
            return workplaceRepository.findByNameWorkplaceContaining(name);
        }
}
