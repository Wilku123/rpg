package com.rpg.rpg.dto.ability;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class AbilitiesDto {

    @NotNull List<AbilityDto> abilityDtos;

    public static AbilitiesDto of(final List<AbilityDto> abilityDtos){
        return new AbilitiesDto(abilityDtos);
    }
}
