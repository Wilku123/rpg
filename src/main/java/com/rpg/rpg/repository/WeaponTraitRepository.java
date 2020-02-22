package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.WeaponTraitEntity;

import java.util.List;
import java.util.Optional;

public interface WeaponTraitRepository {
    List<WeaponTraitEntity> readAll();
    WeaponTraitEntity readOne(String id);
    WeaponTraitEntity readByName(String name);
}
