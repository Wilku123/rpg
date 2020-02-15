package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.AbilityEntity;

import java.util.List;
import java.util.Optional;

public interface AbilityRepository {
    List<AbilityEntity> readAll();
    Optional<AbilityEntity> readOne(String id);
    AbilityEntity readByName(String name);

}
