package com.rpg.dto.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NameDto {

    @NotNull
    @NotEmpty
    final private String name;

    public static NameDto of(final String name) {
        return new NameDto(name);
    }
}
