package com.rpg.rpg.dto.equipment;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class ArmorsDto {

    private List<ArmorDto> armorEntityList;

    public static ArmorsDto of(final List<ArmorDto> armorEntityList){
        return new ArmorsDto(armorEntityList);
    }
}
