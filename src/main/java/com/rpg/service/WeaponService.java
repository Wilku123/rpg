package com.rpg.service;

import com.rpg.dto.util.NameDto;
import com.rpg.repository.WeaponRepository;
import com.rpg.dto.equipment.WeaponDto;
import com.rpg.dto.equipment.WeaponsDto;
import com.rpg.mapper.WeaponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    public WeaponDto readOne(final String id) {
        return WeaponMapper.toDto(weaponRepository.readOne(id));
    }

    public WeaponsDto readAll() {
        return WeaponMapper.toDto(weaponRepository.readAll());
    }

    public WeaponDto readByName(final NameDto name) {
        return WeaponMapper.toDto(weaponRepository.readByName(name.getName()));
    }
}
