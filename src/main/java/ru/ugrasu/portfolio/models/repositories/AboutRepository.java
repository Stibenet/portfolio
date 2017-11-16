package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;

import java.util.List;

/**
 * Created by Марсель on 16.11.2017.
 */
public interface AboutRepository extends  CrudRepository<AboutMeEntity, Integer>{
        @Query("select p from AboutMeEntity p where p.description like concat(:name,'%')")
        List<AboutMeEntity> findByDescriptionAboutContaining(@Param("name") String name);
}
