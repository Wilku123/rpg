package com.rpg.rpg.dto.skill;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class SkillDto {

    @NotNull
    @NotEmpty
    private String id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String type;

    @NotNull
    @NotEmpty
    private String trait;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    private String relAbility;

    public static SkillDto of (final String id,
                               final String name,
                               final String type,
                               final String trait,
                               final String description,
                               final String relAbility){
        return new SkillDto(id,name,type,trait,description,relAbility);
    }
}
