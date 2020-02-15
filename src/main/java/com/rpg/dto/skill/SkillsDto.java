package com.rpg.dto.skill;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SkillsDto {

    @NotNull
    private final List<SkillDto> skillDtos;

    public static SkillsDto of(
            final List<SkillDto> abilityEntityList){
        return new SkillsDto(abilityEntityList);
    }
}
