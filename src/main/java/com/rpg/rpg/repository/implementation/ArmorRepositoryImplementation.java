package com.rpg.rpg.repository.implementation;


import com.rpg.rpg.model.entity.ArmorEntity;
import com.rpg.rpg.repository.ArmorRepository;
import com.rpg.rpg.repository.orm.ArmorOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArmorRepositoryImplementation implements ArmorRepository {
    @Autowired
    private ArmorOrmRepository armorOrmRepository;

    @Override
    public List<ArmorEntity> readAll() {
        return armorOrmRepository.findAll();
    }

    @Override
    public ArmorEntity readOne(String id) {
        return armorOrmRepository.findById(id).orElse(null);
    }

    @Override
    public ArmorEntity readByName(String name) {
        return armorOrmRepository.findByName(name);
    }
}
