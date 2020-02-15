package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.BeastEntity;

import java.util.List;

public interface BeastRepository {
    List<BeastEntity> readAll();
    BeastEntity readOne(String id);
    BeastEntity readByName(String name);
}
