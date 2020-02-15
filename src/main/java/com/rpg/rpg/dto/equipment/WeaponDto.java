package com.rpg.rpg.dto.equipment;


import com.mongodb.lang.Nullable;
import com.rpg.rpg.model.entity.WeaponTraitEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeaponDto {

    @NotNull
    @NotEmpty
    private String id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String price;

    @NotNull
    @NotEmpty
    private String weight;

    @Nullable
    private String category;

    @Nullable
    private String rangeMin;
    @Nullable
    private String rangeMax;

    @Nullable
    private String reload;

    @Nullable
    private String strength;

    @Nullable
    private List<WeaponTraitEntity> weaponTrait;

    @Nullable
    private String accessibility;

    public static WeaponDto of(final String id,
                               final String name,
                               final String price,
                               final String weight,
                               final String category,
                               final String rangeMin,
                               final String rangeMax,
                               final String reload,
                               final String strength,
                               final List<WeaponTraitEntity> weaponTrait,
                               final String accessibility){
        return new WeaponDto(id,name,price,weight,category,rangeMin,rangeMax,reload,strength,weaponTrait,accessibility);
    }
}
