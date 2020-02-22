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
    private List<SkillEntity> skillList;
    private List<AbilityEntity> abilityList;
    private List<WeaponEntity> weaponList;
    private List<ArmorEntity> armorList;
    private List<EquipmentEntity> equipmentList;
    private List<ProfessionEntity> inputProf;
    private List<ProfessionEntity> outputProf;


}
