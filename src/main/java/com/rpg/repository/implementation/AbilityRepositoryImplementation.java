package com.rpg.repository.implementation;

import com.rpg.model.entity.AbilityEntity;
import com.rpg.repository.AbilityRepository;
import com.rpg.repository.orm.AbilityOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AbilityRepositoryImplementation implements AbilityRepository {

    @Autowired
    private AbilityOrmRepository abilityOrmRepository;

    @Override
    public List<AbilityEntity> readAll() {
        return abilityOrmRepository.findAll();
    }

    @Override
    public Optional<AbilityEntity> readOne(String id) {
        return abilityOrmRepository.findById(id);
    }

    @Override
    public AbilityEntity readByName(String name) {
        return abilityOrmRepository.findByName(name);
    }
}
