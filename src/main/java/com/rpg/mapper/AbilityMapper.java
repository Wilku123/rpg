package com.rpg.mapper;

import com.rpg.dto.ability.AbilitiesDto;
import com.rpg.dto.ability.AbilityDto;
import com.rpg.model.entity.AbilityEntity;

import java.util.List;
import java.util.stream.Collectors;

public class AbilityMapper {
    public static AbilityDto toDto(AbilityEntity abilityEntity) {
        return AbilityDto.of(abilityEntity.getId(),
                abilityEntity.getName(),
                abilityEntity.getDescription());
    }

    public static AbilitiesDto toDto(List<AbilityEntity> abilityEntities) {
        return AbilitiesDto.of(
                abilityEntities
                        .stream()
                        .map(ability -> AbilityDto.of(
                                ability.getId(),
                                ability.getName(),
                                ability.getDescription()))
                        .collect(Collectors.toList()));
    }
}
