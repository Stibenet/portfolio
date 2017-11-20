package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.ExperienceWorkEntity;
import ru.ugrasu.portfolio.models.repositories.ExperienceRepository;

/**
 * Created by Марсель on 21.11.2017.
 */
@Component
public class ExperienceService {
    @Autowired
    ExperienceRepository expRepository;

    public ExperienceWorkEntity findById(int id) throws DbEntityNotFoundException {

        ExperienceWorkEntity exp;
        exp = expRepository.findOne(id);
        if (exp == null){
            throw new DbEntityNotFoundException("Id " + id + " field 'experience' not found");
        }
        return exp;
    }
}
