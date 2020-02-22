package com.rpg.repository;

import com.rpg.model.entity.WeaponTraitEntity;

import java.util.List;

public interface WeaponTraitRepository {
    List<WeaponTraitEntity> readAll();
    WeaponTraitEntity readOne(String id);
    WeaponTraitEntity readByName(String name);
}
