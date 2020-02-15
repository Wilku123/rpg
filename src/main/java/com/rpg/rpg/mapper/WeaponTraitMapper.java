package com.rpg.rpg.mapper;

import com.rpg.rpg.dto.equipment.WeaponTraitDto;
import com.rpg.rpg.dto.equipment.WeaponTraitsDto;
import com.rpg.rpg.model.entity.WeaponEntity;
import com.rpg.rpg.model.entity.WeaponTraitEntity;

import java.util.List;
import java.util.stream.Collectors;

public class WeaponTraitMapper {
    public static WeaponTraitDto toDto(WeaponTraitEntity weaponTraitEntity){
        return WeaponTraitDto.of(weaponTraitEntity.getId(),weaponTraitEntity.getName(),weaponTraitEntity.getDescription());
    }
    public static WeaponTraitsDto toDto(List<WeaponTraitEntity> weaponEntities){
        return WeaponTraitsDto.of(weaponEntities.stream().map(trait->WeaponTraitDto.of(trait.getId(),trait.getName(),trait.getDescription())).collect(Collectors.toList()));
    }
    public static WeaponTraitEntity fromDto(WeaponTraitDto weaponTraitDto){
        return new WeaponTraitEntity(weaponTraitDto.getId(),weaponTraitDto.getName(),weaponTraitDto.getDescription());
    }
}
