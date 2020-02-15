package com.rpg.repository.implementation;

import com.rpg.model.entity.WeaponTraitEntity;
import com.rpg.repository.WeaponTraitRepository;
import com.rpg.repository.orm.WeaponTraitOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WeaponTraitImplementation implements WeaponTraitRepository {
    @Autowired
    private WeaponTraitOrmRepository weaponTraitOrmRepository;

    @Override
    public List<WeaponTraitEntity> readAll() {
        return weaponTraitOrmRepository.findAll();
    }

    @Override
    public WeaponTraitEntity readOne(String id) {
        return weaponTraitOrmRepository.findById(id).orElse(null);
    }
}
