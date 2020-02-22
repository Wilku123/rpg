package com.rpg.dto.equipment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class EquipmentsDto {

    private List<EquipmentDto> equipments;

    public static EquipmentsDto of(final List<EquipmentDto> equipments){
        return new EquipmentsDto(equipments);
    }
}
