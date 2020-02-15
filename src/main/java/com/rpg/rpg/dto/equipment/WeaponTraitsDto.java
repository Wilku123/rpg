package com.rpg.rpg.dto.equipment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeaponTraitsDto {

    @NotNull
    private List<WeaponTraitDto> weaponTraitDtos;

    public static WeaponTraitsDto of(List<WeaponTraitDto> weaponTraitDtos){
        return new WeaponTraitsDto(weaponTraitDtos);
    }
}
