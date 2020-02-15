package com.rpg.rpg.service;

import com.rpg.rpg.dto.equipment.EquipmentDto;
import com.rpg.rpg.dto.equipment.EquipmentsDto;
import com.rpg.rpg.mapper.EquipmentMapper;
import com.rpg.rpg.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    public EquipmentsDto readAll(){
        return EquipmentMapper.toDto(equipmentRepository.readAll());
    }

    public EquipmentDto readOne(String id){
        return EquipmentMapper.toDto(equipmentRepository.readOne(id));
    }

    public EquipmentDto readByName(String name){
        return EquipmentMapper.toDto(equipmentRepository.readByName(name));
    }
}
