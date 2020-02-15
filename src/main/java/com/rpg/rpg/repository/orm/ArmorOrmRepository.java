package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.ArmorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ArmorOrmRepository extends MongoRepository<ArmorEntity,String> {
    List<ArmorEntity> findAll();
    Optional<ArmorEntity> findById(String id);
    ArmorEntity findByName(String name);
}
