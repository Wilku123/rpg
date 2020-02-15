package com.rpg.dto.equipment;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeaponsDto {

    List<WeaponDto> weaponEntities;

    public static WeaponsDto of(final List<WeaponDto> weaponEntities){
        return new WeaponsDto(weaponEntities);
    }
}
