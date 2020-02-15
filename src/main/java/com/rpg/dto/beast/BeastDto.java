package com.rpg.dto.beast;


import com.rpg.model.entity.AbilityEntity;
import com.rpg.model.entity.ArmorEntity;
import com.rpg.model.entity.SkillEntity;
import com.rpg.model.entity.WeaponEntity;
import com.rpg.model.utility.ArmorPoints;
import com.rpg.model.utility.MainTraits;
import com.rpg.model.utility.SecondaryTraits;
import com.rpg.model.utility.SpecialRule;
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
public class BeastDto {

    @NotNull
    @NotEmpty
    private String id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String description;

    private String img;

    @NotNull
    @NotEmpty
    private MainTraits mainTraits;

    @NotNull
    @NotEmpty
    private SecondaryTraits secondaryTraits;
    private List<SkillEntity> skillList;
    private List<AbilityEntity> abilityList;
    private List<SpecialRule> specialRules;
    private List<ArmorEntity> armorList;

    @NotNull
    @NotEmpty
    private ArmorPoints armorPoints;

    @NotNull
    @NotEmpty
    private WeaponEntity weapon;

    @NotNull
    @NotEmpty
    private String difficulty;

    public static BeastDto of(
            final String id,
            final String name,
            final String description,
            final String img,
            final MainTraits mainTraits,
            final SecondaryTraits secondaryTraits,
            final List<SkillEntity> skillEntities,
            final List<AbilityEntity> abilityEntities,
            final List<SpecialRule> specialRules,
            final List<ArmorEntity> armorEntities,
            final ArmorPoints armorPoints,
            final WeaponEntity weaponEntity,
            final String difficulty) {
        return new BeastDto(
                id, name, description, img, mainTraits, secondaryTraits, skillEntities, abilityEntities,
                specialRules, armorEntities, armorPoints, weaponEntity, difficulty);
    }
}
