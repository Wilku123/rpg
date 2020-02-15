package com.rpg.dto.spell;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class SpellDto {

    @NotNull
    @NotEmpty
    private String id;

    private String typeOfMagic;

    private String domain;


    @NotNull
    @NotEmpty
    private String name;


    private String reqPower;
    private String castingTime;
    private String ingredient;
    private String duration;


    @NotNull
    @NotEmpty
    private String description;


    public static SpellDto of(
            final String id,
            final String typeOfMagic,
            final String domain,
            final String name,
            final String reqPower,
            final String castingTime,
            final String ingredient,
            final String duration,
            final String description
    ){
        return new SpellDto(id,typeOfMagic,domain,name,reqPower,castingTime,ingredient,duration,description);
    }

}
