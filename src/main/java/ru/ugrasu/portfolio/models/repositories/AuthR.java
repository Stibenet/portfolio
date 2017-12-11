package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.entities.AuthEntity;
import ru.ugrasu.portfolio.models.entities.ExperienceWorkEntity;

import java.util.List;

/**
 * Created by Марсель on 11.12.2017.
 */
public interface AuthR extends CrudRepository<AuthEntity, Integer> {
    @Query("select p from AuthEntity p where p.login like concat(:name,'%')")
    List<AuthEntity> findByDescriptionAboutContaining(@Param("name") String name);
}