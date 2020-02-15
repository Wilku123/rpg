package com.rpg.rpg.repository;

import com.rpg.rpg.model.entity.SkillEntity;

import java.util.List;
import java.util.Optional;

public interface SkillRepository {
    List<SkillEntity> readAll();
    List<SkillEntity> readByName(String name);
    SkillEntity readOne(String id);
}
