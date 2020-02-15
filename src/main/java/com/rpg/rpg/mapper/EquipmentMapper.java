package com.rpg.rpg.mapper;


import com.rpg.rpg.dto.equipment.EquipmentDto;
import com.rpg.rpg.dto.equipment.EquipmentsDto;
import com.rpg.rpg.model.entity.EquipmentEntity;

import java.util.List;
import java.util.stream.Collectors;

public class EquipmentMapper {

    public static EquipmentsDto toDto(List<EquipmentEntity> equipmentEntity){
        return EquipmentsDto.of(equipmentEntity.stream().map(eq-> EquipmentDto.of(eq.getId(),
                eq.getType(),
                eq.getName(),
                eq.getPrice(),
                eq.getWeight(),
                eq.getAccessibility())).collect(Collectors.toList()));
    }

    public static EquipmentDto toDto(EquipmentEntity equipmentEntity){
        return EquipmentDto.of(equipmentEntity.getId(),
                equipmentEntity.getType(),
                equipmentEntity.getName(),
                equipmentEntity.getPrice(),
                equipmentEntity.getWeight(),
                equipmentEntity.getAccessibility());
    }

    public static EquipmentEntity fromDto(EquipmentDto equipmentDto){
        return new EquipmentEntity(equipmentDto.getId(),
                equipmentDto.getType(),
                equipmentDto.getName(),
                equipmentDto.getPrice(),
                equipmentDto.getWeight(),
                equipmentDto.getAccessibility());
    }
}
