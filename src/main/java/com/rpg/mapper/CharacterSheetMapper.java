package com.rpg.mapper;

import com.rpg.dto.beast.BeastDto;
import com.rpg.dto.characterSheet.CharacterSheetDto;
import com.rpg.dto.characterSheet.CharacterSheetsDto;
import com.rpg.model.entity.CharacterSheetEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterSheetMapper {

    public static CharacterSheetDto toDto(CharacterSheetEntity sheetEntity) {
        return CharacterSheetDto.of(sheetEntity.getId(),
                sheetEntity.getHero(),
                sheetEntity.getDescription(),
                sheetEntity.getTraits(),
                sheetEntity.getWeapon(),
                sheetEntity.getArmor(),
                sheetEntity.getPlayer(),
                sheetEntity.getExperiencePoints(),
                sheetEntity.getMovement(),
                sheetEntity.getArmorPoints(),
                sheetEntity.getSkill(),
                sheetEntity.getAbility(),
                sheetEntity.getEquipment(),
                sheetEntity.getMoney(),
                sheetEntity.getSpell(), 
                sheetEntity.getOwner());

    }
    public static CharacterSheetsDto toDto(List<CharacterSheetEntity> list){
        return CharacterSheetsDto.of(list.stream().map(cs->CharacterSheetDto.of(
                cs.getId(),
                cs.getHero(),
                cs.getDescription(),
                cs.getTraits(),
                cs.getWeapon(),
                cs.getArmor(),
                cs.getPlayer(),
                cs.getExperiencePoints(),
                cs.getMovement(),
                cs.getArmorPoints(),
                cs.getSkill(),
                cs.getAbility(),
                cs.getEquipment(),
                cs.getMoney(),
                cs.getSpell(),
                cs.getOwner())).collect(Collectors.toList()));
    }
    public static CharacterSheetEntity fromDto(CharacterSheetDto dto){
        return new CharacterSheetEntity(dto.getId(),
                dto.getHero(),
                dto.getDescription(),
                dto.getTraits(),
                dto.getWeapon(),
                dto.getArmor(),
                dto.getPlayer(),
                dto.getExperiencePoints(),
                dto.getMovement(),
                dto.getArmorPoints(),
                dto.getSkill(),
                dto.getAbility(),
                dto.getEquipment(),
                dto.getMoney(),
                dto.getSpell(),
                dto.getOwner());
    }
}
