package com.rpg.repository.implementation;

import com.rpg.model.entity.SkillEntity;
import com.rpg.repository.SkillRepository;
import com.rpg.repository.orm.SkillOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SkillRepositoryImplementation implements SkillRepository {

    @Autowired
    private SkillOrmRepository skillOrmRepository;

    @Override
    public List<SkillEntity> readAll() {
        return skillOrmRepository.findAll();
    }

    @Override
    public SkillEntity readByName(String name) {
        return skillOrmRepository.findByName(name).orElse(null);
    }

    @Override
    public SkillEntity readOne(String id) {
        return skillOrmRepository.findById(id).orElse(null);
    }
}
