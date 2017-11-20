package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.entities.ExperienceWorkEntity;

import java.util.List;

/**
 * Created by Марсель on 21.11.2017.
 */
public interface ExperienceRepository extends CrudRepository<ExperienceWorkEntity, Integer> {
    @Query("select p from ExperienceWorkEntity p where p.jobVacancy like concat(:name,'%')")
    List<AboutMeEntity> findByDescriptionAboutContaining(@Param("name") String name);
}
