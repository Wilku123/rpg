package com.rpg.rpg.mapper;


import com.rpg.rpg.dto.beast.BeastDto;
import com.rpg.rpg.dto.beast.BeastsDto;
import com.rpg.rpg.model.entity.BeastEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BeastMapper {
    public static BeastDto toDto(BeastEntity beastEntity){
        return BeastDto.of(beastEntity.getId(),
                beastEntity.getName(),
                beastEntity.getDescription(),
                beastEntity.getImg(),
                beastEntity.getMainTraits(),
                beastEntity.getSecondaryTraits(),
                beastEntity.getSkillList(),
                beastEntity.getAbilityList(),
                beastEntity.getSpecialRules(),
                beastEntity.getArmorList(),
                beastEntity.getArmorPoints(),
                beastEntity.getWeapon(),
                beastEntity.getDifficulty());
    }

    public static BeastsDto toDto(List<BeastEntity> beastEntities){
        return BeastsDto.of(beastEntities.stream().map(beast-> BeastDto.of(beast.getId(),
                beast.getName(),
                beast.getDescription(),
                beast.getImg(),
                beast.getMainTraits(),
                beast.getSecondaryTraits(),
                beast.getSkillList(),
                beast.getAbilityList(),
                beast.getSpecialRules(),
                beast.getArmorList(),
                beast.getArmorPoints(),
                beast.getWeapon(),
                beast.getDifficulty())).collect(Collectors.toList()));
    }
    public static BeastEntity fromDto(BeastDto beastDto){
        return new BeastEntity(beastDto.getId(),
                beastDto.getName(),
                beastDto.getDescription(),
                beastDto.getImg(),
                beastDto.getMainTraits(),
                beastDto.getSecondaryTraits(),
                beastDto.getSkillList(),
                beastDto.getAbilityList(),
                beastDto.getSpecialRules(),
                beastDto.getArmorList(),
                beastDto.getArmorPoints(),
                beastDto.getWeapon(),
                beastDto.getDifficulty());
    }
}
