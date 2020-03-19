package com.rpg.repository;

import com.rpg.model.entity.SkillEntity;

import java.util.List;

public interface SkillRepository {
    List<SkillEntity> readAll();
    SkillEntity readByName(String name);
    SkillEntity readOne(String id);
}
