package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.WeaponEntity;

import java.util.List;

public interface WeaponRepository {
    List<WeaponEntity> readAll();
    WeaponEntity readOne(String id);
    WeaponEntity readByName(String name);
}
