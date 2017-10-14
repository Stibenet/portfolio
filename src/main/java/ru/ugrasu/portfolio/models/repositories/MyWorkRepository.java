package ru.ugrasu.portfolio.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ugrasu.portfolio.models.entities.MyWorkEntity;

import java.util.List;

/**
 * Created by Марсель on 05.10.2017.
 */
@Repository
public interface MyWorkRepository extends CrudRepository<MyWorkEntity, Integer> {
    @Query("select p from MyWorkEntity p where p.nameWork like concat(:name,'%')")
    List<MyWorkEntity> findByNameWorkContaining(@Param("name") String name);
}
