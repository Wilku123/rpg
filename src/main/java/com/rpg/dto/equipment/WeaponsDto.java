package com.rpg.dto.equipment;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeaponsDto {

    private final List<WeaponDto> weapons;

    public static WeaponsDto of(final List<WeaponDto> weapons){
        return new WeaponsDto(weapons);
    }
}
