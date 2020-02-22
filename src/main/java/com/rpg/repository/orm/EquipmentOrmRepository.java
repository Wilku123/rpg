package com.rpg.repository.orm;

import com.rpg.model.entity.EquipmentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EquipmentOrmRepository extends MongoRepository<EquipmentEntity, String> {
    Optional<EquipmentEntity> findById(String id);
    EquipmentEntity findByName(String name);
}
