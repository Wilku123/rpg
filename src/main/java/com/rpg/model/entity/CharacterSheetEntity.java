package com.rpg.model.entity;


import com.rpg.model.utility.characterSheet.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document("characterSheet")
@AllArgsConstructor
@Getter
public class CharacterSheetEntity {

    @Id
    private String id;
    private Hero hero;
    private HeroDescription description;
    private HeroTraits traits;
    private List<String> weapon;
    private List<String> armor;
    private PlayerInfo player;
    private ExperiencePoints experiencePoints;
    private HeroMovement movement;
    private HeroArmorPoints armorPoints;
    private List<HeroSkill> skill;
    private List<HeroAbility> ability;
    private List<HeroEquipment> equipment;
    private HeroMoney money;
    private List<HeroSpell> spell;
    private List<HeroMutation> mutations;
    private String owner;

}
