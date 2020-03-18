package com.rpg.repository.orm;

import com.rpg.model.entity.AbilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AbilityOrmRepository extends MongoRepository<AbilityEntity,String> {
    List<AbilityEntity> findAll();
    Optional<AbilityEntity> findById(String id);

    @Query(value = "{'name': {$regex : ?0, $options: 'i'}}")
    Optional<AbilityEntity> findByNameRegex(String name);
}
