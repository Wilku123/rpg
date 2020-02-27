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
    private List<String> skillList;
    private List<String> abilityList;
    private List<SpecialRule> specialRules;
    private List<String> armorList;
    private ArmorPoints armorPoints;
    private List<String> weapon;
    private String difficulty;

}
