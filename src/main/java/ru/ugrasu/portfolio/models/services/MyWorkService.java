package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.entities.MyWorkEntity;
import ru.ugrasu.portfolio.models.repositories.MyWorkRepository;

import java.util.List;

/**
 * Created by Марсель on 05.10.2017.
 */
@Component
public class MyWorkService {

    @Autowired
    private MyWorkRepository myWorkRepository;

    public MyWorkEntity findById(int id) throws DbEntityNotFoundException {
        MyWorkEntity myWorkEntity;
        myWorkEntity = myWorkRepository.findOne(id);
        if (myWorkEntity == null){
            throw new DbEntityNotFoundException("Work with id = " + id + "not found");
        }
        return myWorkEntity;
    }

    public MyWorkEntity createWork(MyWorkEntity myWorkEntity) throws DbEntityNotFoundException {
        if (myWorkEntity == null){
            throw new DbEntityNotFoundException("Work is empty");
        }
        return myWorkRepository.save(myWorkEntity);
    }
}
