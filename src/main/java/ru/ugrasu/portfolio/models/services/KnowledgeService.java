package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.KnowledgeRepository;

import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Component
public class KnowledgeService {
    @Autowired
    private KnowledgeRepository knowledgeRepository;

    public KnowledgeEntity createKnows(KnowledgeEntity knowledgeEntity) throws DbEntityNotFoundException {
        if (knowledgeEntity == null){
            throw new DbEntityNotFoundException("Knowledge is empty");
        }
        return knowledgeRepository.save(knowledgeEntity);
    }

    public KnowledgeEntity updateKnows(KnowledgeEntity knowledgeEntity) throws DbEntityNotFoundException {
        if (knowledgeEntity == null){
            throw new DbEntityNotFoundException("Knowledge is empty");
        }
        return knowledgeRepository.save(knowledgeEntity);
    }

    public void deleteKnows(Integer idKnowledge) throws DbEntityNotFoundException {
        if (idKnowledge == null){
            throw  new DbEntityNotFoundException("id = " + idKnowledge + "not found");
        }
        knowledgeRepository.delete(idKnowledge);
    }

    public KnowledgeEntity findById(int id) throws DbEntityNotFoundException {
        KnowledgeEntity knowledgeEntity;
        knowledgeEntity = knowledgeRepository.findOne(id);
        if (knowledgeEntity == null){
            throw new DbEntityNotFoundException("Knowledge with id = " + id + "not found");
        }
        return knowledgeEntity;
    }
}
