package com.rpg.repository.orm;

import com.rpg.model.entity.WeaponTraitEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface WeaponTraitOrmRepository extends MongoRepository<WeaponTraitEntity,String> {
    List<WeaponTraitEntity> findAll();
    Optional<WeaponTraitEntity> findById(String id);
}
