package com.rpg.repository.implementation;

import com.rpg.model.entity.WeaponEntity;
import com.rpg.repository.WeaponRepository;
import com.rpg.repository.orm.WeaponOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WeaponRepositoryImplementation implements WeaponRepository {

    @Autowired
    private WeaponOrmRepository weaponOrmRepository;

    @Override
    public List<WeaponEntity> readAll() {
        return weaponOrmRepository.findAll();
    }

    @Override
    public WeaponEntity readOne(String id) {
        return weaponOrmRepository.findById(id).orElse(null);
    }

    @Override
    public WeaponEntity readByName(String name) {
        return weaponOrmRepository.findByName(name);
    }
}
