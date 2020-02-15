package com.rpg.repository;

import com.rpg.model.entity.SpellEntity;

import java.util.List;

public interface SpellRepository {

    List<SpellEntity> readAll();
    SpellEntity readOne(String id);
    SpellEntity readByName(String name);
}
