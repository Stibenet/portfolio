package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.entities.MyWorkEntity;

import java.util.List;

/**
 * Created by Марсель on 14.10.2017.
 */
@Repository
public interface KnowledgeRepository extends CrudRepository<KnowledgeEntity, Integer> {
    @Query("select p from KnowledgeEntity p where p.nameKnowledge like concat(:name,'%')")
    List<KnowledgeEntity> findByNameKnowledgeContaining(@Param("name") String name);



}
