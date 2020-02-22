package com.rpg.dto.equipment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ArmorDto {

    @NotNull
    @NotEmpty
    private String id;

    @NotNull
    @NotEmpty
    private String type;
    @NotNull
    @NotEmpty
    private String name;

    private String price;
    private String weight;

    @NotNull
    @NotEmpty
    private String location;

    @NotNull
    @NotEmpty
    private String armorPoints;
    private String accessibility;

    public static ArmorDto of(final String id,
                              final String type,
                              final String name,
                              final String price,
                              final String weight,
                              final String location,
                              final String armorPoints,
                              final String accessibility){
        return new ArmorDto(id,type,name,price,weight,location,armorPoints,accessibility);
    }

}
