package com.rpg.mapper;

import com.rpg.dto.skill.SkillsDto;
import com.rpg.dto.skill.SkillDto;
import com.rpg.model.entity.SkillEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class SkillMapper {

    public static SkillEntity fromDto(SkillDto dto) {
        return new SkillEntity(dto.getId(),
                dto.getName(),
                dto.getType(),
                dto.getTrait(),
                dto.getDescription(),
                dto.getRelAbility());
    }

    public static SkillDto toDto(SkillEntity skillEntity) {
        return SkillDto.of(skillEntity.getId(),
                skillEntity.getName(),
                skillEntity.getType(),
                skillEntity.getTrait(),
                skillEntity.getDescription(),
                skillEntity.getRelAbility());
    }

    public static SkillsDto toDto(List<SkillEntity> skillEntities) {
        return SkillsDto.of(skillEntities.stream()
                .map(skill -> SkillDto.of(
                        skill.getId(),
                        skill.getName(),
                        skill.getType(),
                        skill.getTrait(),
                        skill.getDescription(),
                        skill.getRelAbility()
                ))
                .collect(Collectors.toList())
        );
    }
}
