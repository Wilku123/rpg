package com.rpg.service;


import com.rpg.dto.util.NameDto;
import com.rpg.repository.ArmorRepository;
import com.rpg.dto.equipment.ArmorDto;
import com.rpg.dto.equipment.ArmorsDto;
import com.rpg.mapper.ArmorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmorService {

    @Autowired
    private ArmorRepository armorRepository;

    public ArmorsDto readAll() {
        return ArmorMapper.toDto(armorRepository.readAll());
    }

    public ArmorDto readOne(final String id){
        return ArmorMapper.toDto(armorRepository.readOne(id));

    }
    public ArmorDto readByName(final NameDto name){
        return ArmorMapper.toDto(armorRepository.readByName(name.getName()));
    }
}
