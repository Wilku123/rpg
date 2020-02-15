package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.WeaponEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface WeaponOrmRepository extends MongoRepository<WeaponEntity, String> {
    List<WeaponEntity> findAll();
    Optional<WeaponEntity> findById(String id);
    WeaponEntity findByName(String name);
}
