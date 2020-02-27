package com.rpg.model.entity;

import com.rpg.model.utility.MainTraits;
import com.rpg.model.utility.SecondaryTraits;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("profession")
@Getter
@AllArgsConstructor
public class ProfessionEntity {

    @Id
    private String id;

    private String name;
    private String description;
    private MainTraits mainTraits;
    private SecondaryTraits secondaryTraits;
    private List<String> skillList;
    private List<String> abilityList;
    private List<String> weaponList;
    private List<String> armorList;
    private List<String> equipmentList;
    private List<String> inputProf;
    private List<String> outputProf;


}
