package com.rpg.rpg.dto.equipment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EquipmentDto {

    @NotNull
    @NotEmpty
    private String id;

    @NotNull
    @NotEmpty
    private String type;

    private String name;
    private String price;
    private String weight;
    private String accessibility;

    public static EquipmentDto of(
            final String id,
            final String type,
            final String name,
            final String price,
            final String weight,
            final String accessibility
    ){
        return new EquipmentDto(id,type,name,price,weight,accessibility);
    }
}
