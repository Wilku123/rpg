package com.rpg.rpg.dto.profession;


import com.rpg.rpg.model.entity.*;
import com.rpg.rpg.model.utility.MainTraits;
import com.rpg.rpg.model.utility.SecondaryTraits;
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
public class ProfessionDto {

    @NotNull
    @NotEmpty
    private String id;

    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String description;
    @NotNull
    @NotEmpty
    private MainTraits mainTraits;
    @NotNull
    @NotEmpty
    private SecondaryTraits secondaryTraits;
    private List<SkillEntity> skillList;
    private List<AbilityEntity> abilityList;
    private List<WeaponEntity> weaponList;
    private List<ArmorEntity> armorList;
    private List<EquipmentEntity> equipmentList;
    private List<ProfessionEntity> inputProf;
    private List<ProfessionEntity> outputProf;

    public static ProfessionDto of(
            final String id,
            final String name,
            final String description,
            final MainTraits mainTraits,
            final SecondaryTraits secondaryTraits,
            final List<SkillEntity> skillEntities,
            final List<AbilityEntity> abilityList,
            final List<WeaponEntity> weaponList,
            final List<ArmorEntity> armorList,
            final List<EquipmentEntity> equipmentList,
            final List<ProfessionEntity> inputProf,
            final List<ProfessionEntity> outputProf
    ){
        return new ProfessionDto(id,name,description,mainTraits,secondaryTraits,skillEntities,abilityList,weaponList,armorList,equipmentList,inputProf,outputProf);
    }
}
