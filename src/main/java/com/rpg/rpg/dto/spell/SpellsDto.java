package com.rpg.rpg.dto.spell;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class SpellsDto {

    private List<SpellDto> spellDtos;

    public static SpellsDto of(
            final List<SpellDto> spellDtos
    ){
        return new SpellsDto(spellDtos);
    }
}
