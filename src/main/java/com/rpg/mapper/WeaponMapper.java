package com.rpg.mapper;

import com.rpg.dto.equipment.WeaponDto;
import com.rpg.dto.equipment.WeaponsDto;
import com.rpg.model.entity.WeaponEntity;

import java.util.List;
import java.util.stream.Collectors;

public class WeaponMapper {

    public static WeaponEntity fromDto(WeaponDto weaponDto) {
        return new WeaponEntity(
                weaponDto.getId(),
                weaponDto.getName(),
                weaponDto.getPrice(),
                weaponDto.getWeight(),
                weaponDto.getCategory(),
                weaponDto.getRangeMin(),
                weaponDto.getRangeMax(),
                weaponDto.getReload(),
                weaponDto.getStrength(),
                weaponDto.getWeaponTrait(),
                weaponDto.getAccessibility()
        );
    }

    public static WeaponDto toDto(WeaponEntity weaponEntity) {
        return WeaponDto.of(
                weaponEntity.getId(),
                weaponEntity.getName(),
                weaponEntity.getPrice(),
                weaponEntity.getWeight(),
                weaponEntity.getCategory(),
                weaponEntity.getRangeMin(),
                weaponEntity.getRangeMax(),
                weaponEntity.getReload(),
                weaponEntity.getStrength(),
                weaponEntity.getWeaponTrait(),
                weaponEntity.getAccessibility()
        );
    }

    public static WeaponsDto toDto(List<WeaponEntity> weaponEntities) {
        return WeaponsDto.of(
                weaponEntities
                        .stream()
                        .map(weapon -> WeaponDto.of(
                                weapon.getId(),
                                weapon.getName(),
                                weapon.getPrice(),
                                weapon.getWeight(),
                                weapon.getCategory(),
                                weapon.getRangeMin(),
                                weapon.getRangeMax(),
                                weapon.getReload(),
                                weapon.getStrength(),
                                weapon.getWeaponTrait(),
                                weapon.getAccessibility()
                        ))
                        .collect(Collectors.toList()));
    }
}
