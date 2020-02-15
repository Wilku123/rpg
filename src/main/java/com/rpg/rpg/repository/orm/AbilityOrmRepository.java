package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.AbilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AbilityOrmRepository extends MongoRepository<AbilityEntity,String> {
    List<AbilityEntity> findAll();
    Optional<AbilityEntity> findById(String id);
    AbilityEntity findByName(String name);
}
