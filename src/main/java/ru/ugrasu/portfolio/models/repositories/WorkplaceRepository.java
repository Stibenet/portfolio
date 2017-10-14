package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.entities.MyWorkEntity;
import ru.ugrasu.portfolio.models.entities.WorkplaceEntity;

import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Repository
public interface WorkplaceRepository extends CrudRepository<WorkplaceEntity, Integer> {
    @Query("select p from WorkplaceEntity p where p.name like concat(:name,'%')")
    List<WorkplaceEntity> findByNameWorkplaceContaining(@Param("name") String name);
}