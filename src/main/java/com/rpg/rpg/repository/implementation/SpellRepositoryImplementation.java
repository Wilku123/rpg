package com.rpg.rpg.repository.implementation;

import com.rpg.rpg.dto.spell.SpellDto;
import com.rpg.rpg.model.entity.SpellEntity;
import com.rpg.rpg.repository.SpellRepository;
import com.rpg.rpg.repository.orm.SpellOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpellRepositoryImplementation implements SpellRepository {

    @Autowired
    private SpellOrmRepository spellOrmRepository;

    @Override
    public List<SpellEntity> readAll() {
        return spellOrmRepository.findAll();
    }

    @Override
    public SpellEntity readOne(String id) {
        return spellOrmRepository.findById(id).orElse(null);
    }

    @Override
    public SpellEntity readByName(String name) {
        return spellOrmRepository.findByName(name);
    }
}
