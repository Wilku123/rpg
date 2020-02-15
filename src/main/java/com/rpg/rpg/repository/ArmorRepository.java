package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.ArmorEntity;

import java.util.List;

public interface ArmorRepository {
    List<ArmorEntity> readAll();
    ArmorEntity readOne(String id);
    ArmorEntity readByName(String name);

}
