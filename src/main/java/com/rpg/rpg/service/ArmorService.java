package com.rpg.rpg.service;


import com.rpg.rpg.dto.equipment.ArmorDto;
import com.rpg.rpg.dto.equipment.ArmorsDto;
import com.rpg.rpg.mapper.ArmorMapper;
import com.rpg.rpg.repository.ArmorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmorService {

    @Autowired
    private ArmorRepository armorRepository;

    public ArmorsDto readAll(){
        return ArmorMapper.toDto(armorRepository.readAll());
    }

    public ArmorDto readOne(String id){
        return ArmorMapper.toDto(armorRepository.readOne(id));

    }
    public ArmorDto readByName(String name){
        return ArmorMapper.toDto(armorRepository.readByName(name));
    }
}
