package com.rpg.dto.ability;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public final class AbilityDto {

    @NotNull
    @NotEmpty
    final private String id;

    @NotNull
    @NotEmpty
    final private String name;

    @NotNull
    @NotEmpty
    final private String description;

    public static AbilityDto of(
            final String id,
            final String name,
            final String description) {
        return new AbilityDto(id, name, description);
    }

}
