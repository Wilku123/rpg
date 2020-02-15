package com.rpg.repository;

import com.rpg.model.entity.ProfessionEntity;

import java.util.List;

public interface ProfessionRepository {

    List<ProfessionEntity> readAll();
    ProfessionEntity readOne(String id);
    ProfessionEntity readByName(String name);
}
