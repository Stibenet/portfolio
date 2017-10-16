package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ugrasu.portfolio.models.entities.UserEntity;

import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
    @Query("select p from UserEntity p where p.name like concat(:name, '%') ")
    List<UserEntity> findByNameUserContaining(@Param("name") String name);
}
