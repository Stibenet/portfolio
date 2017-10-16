package ru.ugrasu.portfolio.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ugrasu.portfolio.models.entities.UserEntity;
import ru.ugrasu.portfolio.models.repositories.UserRepository;

import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> findByNameUser(String nameUser){
        return userRepository.findByNameUserContaining(nameUser);
    }
}
