package com.rpg.rpg.service;

import com.rpg.rpg.dto.equipment.WeaponTraitDto;
import com.rpg.rpg.dto.equipment.WeaponTraitsDto;
import com.rpg.rpg.mapper.WeaponTraitMapper;
import com.rpg.rpg.repository.WeaponTraitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponTraitService {

    @Autowired
    private WeaponTraitRepository weaponTraitRepository;

    public WeaponTraitDto getOne(String id){
        return WeaponTraitMapper.toDto(weaponTraitRepository.readOne(id));
    }
    public WeaponTraitDto getByName(String name){
        return WeaponTraitMapper.toDto(weaponTraitRepository.readByName(name));
    }
    public WeaponTraitsDto getAll(){
        return WeaponTraitMapper.toDto(weaponTraitRepository.readAll());
    }
}
