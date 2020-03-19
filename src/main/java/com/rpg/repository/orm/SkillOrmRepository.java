package com.rpg.repository.orm;

import com.rpg.model.entity.SkillEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SkillOrmRepository extends MongoRepository<SkillEntity, String> {
    List<SkillEntity> findAll();

    @Query(value = "{'name': {$regex : ?0, $options: 'i'}}")
    Optional<SkillEntity> findByName(String name);

    Optional<SkillEntity> findById(String id);


}
