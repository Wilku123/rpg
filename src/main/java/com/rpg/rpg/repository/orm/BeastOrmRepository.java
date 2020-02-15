package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.BeastEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BeastOrmRepository extends MongoRepository<BeastEntity,String > {
    List<BeastEntity> findAll();
    Optional<BeastEntity> findById(String id);
    BeastEntity findByName(String name);
}
