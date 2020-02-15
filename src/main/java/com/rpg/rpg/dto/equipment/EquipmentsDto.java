package com.rpg.rpg.dto.equipment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class EquipmentsDto {

    private List<EquipmentDto> equipmentDtos;

    public static EquipmentsDto of(final List<EquipmentDto> equipmentDtos){
        return new EquipmentsDto(equipmentDtos);
    }
}
