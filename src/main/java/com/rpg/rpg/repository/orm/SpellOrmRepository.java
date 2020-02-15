package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.SpellEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface SpellOrmRepository extends MongoRepository<SpellEntity, String> {

    List<SpellEntity> findAll();
    Optional<SpellEntity> findById(String id);
    SpellEntity findByName(String name);
}
