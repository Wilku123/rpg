package com.rpg.rpg.service;

import com.rpg.rpg.dto.equipment.WeaponDto;
import com.rpg.rpg.dto.equipment.WeaponsDto;
import com.rpg.rpg.mapper.WeaponMapper;
import com.rpg.rpg.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    public WeaponDto readOne(String id){
        return WeaponMapper.toDto(weaponRepository.readOne(id));
    }
    public WeaponsDto readAll(){
        return WeaponMapper.toDto(weaponRepository.readAll());

    }
    public WeaponDto readByName(String name){
        return WeaponMapper.toDto(weaponRepository.readByName(name));
    }
}
