package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.EquipmentEntity;

import java.util.List;

public interface EquipmentRepository {
    List<EquipmentEntity> readAll();
    EquipmentEntity readOne(String id);
    EquipmentEntity readByName(String name);
}
