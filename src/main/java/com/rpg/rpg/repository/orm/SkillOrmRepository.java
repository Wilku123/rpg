package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.SkillEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface SkillOrmRepository extends MongoRepository<SkillEntity, String> {
    List<SkillEntity> findAll();
    List<SkillEntity> findByName(String name);
    Optional<SkillEntity> findById(String id);


}
