package com.rpg.mapper;

import com.rpg.dto.spell.SpellDto;
import com.rpg.dto.spell.SpellsDto;
import com.rpg.model.entity.SpellEntity;

import java.util.List;
import java.util.stream.Collectors;

public class SpellMapper {

    public static SpellDto toDto(SpellEntity spellEntity){
        return SpellDto.of(spellEntity.getId(),
                spellEntity.getType(),
                spellEntity.getDomain(),
                spellEntity.getName(),
                spellEntity.getReqPower(),
                spellEntity.getCastingTime(),
                spellEntity.getIngredient(),
                spellEntity.getDuration(),
                spellEntity.getDescription(),
                spellEntity.getTable());
    }

    public static SpellsDto toDto(List<SpellEntity> spellEntities) {
        return SpellsDto.of(
                spellEntities
                        .stream()
                        .map(spell -> SpellDto.of(
                                spell.getId(),
                                spell.getType(),
                                spell.getDomain(),
                                spell.getName(),
                                spell.getReqPower(),
                                spell.getCastingTime(),
                                spell.getIngredient(),
                                spell.getDuration(),
                                spell.getDescription(),
                                spell.getTable()))
                        .collect(Collectors.toList())
        );
    }

    public static SpellEntity fromDto(SpellDto spellDto){
        return new SpellEntity(spellDto.getId(),
                spellDto.getType(),
                spellDto.getDomain(),
                spellDto.getName(),
                spellDto.getReqPower(),
                spellDto.getCastingTime(),
                spellDto.getIngredient(),
                spellDto.getDuration(),
                spellDto.getDescription(),
                spellDto.getTable());
    }
}
