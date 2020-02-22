package com.rpg.repository.implementation;


import com.rpg.model.entity.ArmorEntity;
import com.rpg.repository.ArmorRepository;
import com.rpg.repository.orm.ArmorOrmRepository;
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
    public ArmorEntity readOne(final String id) {
        return armorOrmRepository.findById(id).orElse(null);
    }

    @Override
    public ArmorEntity readByName(final String name) {
        return armorOrmRepository.findByName(name);
    }
}
