package com.rpg.repository.implementation;

import com.rpg.model.entity.EquipmentEntity;
import com.rpg.repository.EquipmentRepository;
import com.rpg.repository.orm.EquipmentOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EquipmentRepositoryImplementation implements EquipmentRepository {
    @Autowired
    private EquipmentOrmRepository equipmentOrmRepository;

    @Override
    public List<EquipmentEntity> readAll() {
        return equipmentOrmRepository.findAll();
    }

    @Override
    public EquipmentEntity readOne(String id) {
        return equipmentOrmRepository.findById(id).orElse(null);
    }

    @Override
    public EquipmentEntity readByName(String name) {
        return equipmentOrmRepository.findByName(name);
    }
}
