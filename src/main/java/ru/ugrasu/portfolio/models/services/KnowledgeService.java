package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.KnowledgeRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Component
public class KnowledgeService {
    @Autowired
    private KnowledgeRepository knowledgeRepository;

    public List<KnowledgeEntity> findByNameKnowledge(String nameKnow) throws DbEntityNotFoundException {
        if (nameKnow == null){
            throw new DbEntityNotFoundException("Name = " + nameKnow + "not found");
        }
        return knowledgeRepository.findByNameKnowledgeContaining(nameKnow);
    }

    public List<KnowledgeEntity> getAllKnowledge() throws DbEntityNotFoundException {
        List<KnowledgeEntity> knows = new ArrayList<KnowledgeEntity>();
        Iterator<KnowledgeEntity> iterator = knowledgeRepository.findAll().iterator();
        while (iterator.hasNext()){
            knows.add(iterator.next());
        }
        if (knows == null){
            throw new DbEntityNotFoundException("Elements now found");
        }
        return knows;
    }

    public KnowledgeEntity createKnows(KnowledgeEntity knowledgeEntity){
        return knowledgeRepository.save(knowledgeEntity);
    }

    public KnowledgeEntity updateKnows(KnowledgeEntity knowledgeEntity){
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
            throw new DbEntityNotFoundException("Work with id = " + id + "not found");
        }
        return knowledgeEntity;
    }
}
