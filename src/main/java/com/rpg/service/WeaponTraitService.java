package com.rpg.service;

import com.rpg.repository.WeaponTraitRepository;
import com.rpg.dto.equipment.WeaponTraitDto;
import com.rpg.dto.equipment.WeaponTraitsDto;
import com.rpg.mapper.WeaponTraitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponTraitService {

    @Autowired
    private WeaponTraitRepository weaponTraitRepository;

    public WeaponTraitDto getOne(String id){
        return WeaponTraitMapper.toDto(weaponTraitRepository.readOne(id));
    }
    public WeaponTraitsDto getAll(){
        return WeaponTraitMapper.toDto(weaponTraitRepository.readAll());
    }
}
