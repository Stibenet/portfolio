package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.AuthEntity;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.AuthR;

/**
 * Created by Марсель on 11.12.2017.
 */
@Component
public class AuthS {
    @Autowired
    private AuthR authR;

    public AuthEntity findById(int id) throws DbEntityNotFoundException {
        AuthEntity authEntity;
        authEntity = authR.findOne(id);
        if (authEntity == null){
            throw new DbEntityNotFoundException("Auth with id = " + id + "not found");
        }
        return authEntity;
    }
}
