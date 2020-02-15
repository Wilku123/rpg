package com.rpg.repository.orm;

import com.rpg.model.entity.ProfessionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProfessionOrmRepository extends MongoRepository<ProfessionEntity,String> {
    List<ProfessionEntity> findAll();
    Optional<ProfessionEntity> findById(String id);
    ProfessionEntity findByName(String name);
}
