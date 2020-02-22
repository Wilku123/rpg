package com.rpg.mapper;

import com.rpg.dto.equipment.ArmorDto;
import com.rpg.dto.equipment.ArmorsDto;
import com.rpg.model.entity.ArmorEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class ArmorMapper {

    public static ArmorDto toDto(ArmorEntity armorEntity) {
        return ArmorDto.of(armorEntity.getId(),
                armorEntity.getType(),
                armorEntity.getName(),
                armorEntity.getPrice(),
                armorEntity.getWeight(),
                armorEntity.getLocation(),
                armorEntity.getArmorPoints(),
                armorEntity.getAccessibility());
    }

    public static ArmorsDto toDto(List<ArmorEntity> armorEntities) {
        return ArmorsDto.of(armorEntities.stream().map(armor -> ArmorDto.of(armor.getId(),
                armor.getType(),
                armor.getName(),
                armor.getPrice(),
                armor.getWeight(),
                armor.getLocation(),
                armor.getArmorPoints(),
                armor.getAccessibility())).collect(Collectors.toList()));
    }

    public static ArmorEntity fromDto(ArmorDto armorDto) {
        return new ArmorEntity(armorDto.getId(), armorDto.getType(), armorDto.getName(), armorDto.getPrice(),
                armorDto.getWeight(), armorDto.getLocation(), armorDto.getArmorPoints(),
                armorDto.getAccessibility());
    }
}
