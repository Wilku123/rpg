package com.rpg.repository;

import com.rpg.model.entity.AbilityEntity;

import java.util.List;
import java.util.Optional;

public interface AbilityRepository {
    List<AbilityEntity> readAll();
    AbilityEntity readOne(String id);
    AbilityEntity readByName(String name);

}
