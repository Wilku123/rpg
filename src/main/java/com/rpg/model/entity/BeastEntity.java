package com.rpg.model.entity;


import com.rpg.model.utility.ArmorPoints;
import com.rpg.model.utility.MainTraits;
import com.rpg.model.utility.SecondaryTraits;
import com.rpg.model.utility.SpecialRule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@Getter
@Document("beast")
public class BeastEntity {

    @Id
    private String id;

    private String name;
    private String description;
    private String img;
    private MainTraits mainTraits;
    private SecondaryTraits secondaryTraits;
    private List<SkillEntity> skillList;
    private List<AbilityEntity> abilityList;
    private List<SpecialRule> specialRules;
    private List<ArmorEntity> armorList;
    private ArmorPoints armorPoints;
    private WeaponEntity weapon;
    private String difficulty;

}
