package com.rpg.dto.spell;

import com.rpg.model.utility.TableForSpells;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class SpellDto {

    @NotNull
    @NotEmpty
    private String id;

    private String type;

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

    private List<TableForSpells> table;


    public static SpellDto of(
            final String id,
            final String type,
            final String domain,
            final String name,
            final String reqPower,
            final String castingTime,
            final String ingredient,
            final String duration,
            final String description,
            final List<TableForSpells> table
    ){
        return new SpellDto(id,type,domain,name,reqPower,castingTime,ingredient,duration,description,table);
    }

}
