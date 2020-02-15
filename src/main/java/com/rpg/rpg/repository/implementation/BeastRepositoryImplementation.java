package com.rpg.rpg.repository.implementation;

import com.rpg.rpg.model.entity.BeastEntity;
import com.rpg.rpg.repository.BeastRepository;
import com.rpg.rpg.repository.orm.BeastOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BeastRepositoryImplementation implements BeastRepository {
    @Autowired
    private BeastOrmRepository beastOrmRepository;

    @Override
    public List<BeastEntity> readAll() {
        return beastOrmRepository.findAll();
    }

    @Override
    public BeastEntity readOne(String id) {
        return beastOrmRepository.findById(id).orElse(null);
    }

    @Override
    public BeastEntity readByName(String name) {
        return beastOrmRepository.findByName(name);
    }
}
