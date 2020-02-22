package com.rpg.rpg.dto.equipment;


import com.rpg.rpg.model.entity.WeaponEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeaponsDto {

    List<WeaponDto> weaponDtos;

    public static WeaponsDto of(final List<WeaponDto> weaponEntities){
        return new WeaponsDto(weaponEntities);
    }
}
