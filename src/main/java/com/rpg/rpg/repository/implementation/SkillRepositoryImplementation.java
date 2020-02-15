package com.rpg.rpg.repository.implementation;

import com.rpg.rpg.model.entity.SkillEntity;
import com.rpg.rpg.repository.SkillRepository;
import com.rpg.rpg.repository.orm.SkillOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SkillRepositoryImplementation implements SkillRepository {

    @Autowired
    private SkillOrmRepository skillOrmRepository;

    @Override
    public List<SkillEntity> readAll() {
        return skillOrmRepository.findAll();
    }

    @Override
    public List<SkillEntity> readByName(String name) {
        return skillOrmRepository.findByName(name);
    }

    @Override
    public SkillEntity readOne(String id) {
        return skillOrmRepository.findById(id).orElse(null);
    }
}
