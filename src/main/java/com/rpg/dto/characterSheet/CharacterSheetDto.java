package com.rpg.dto.characterSheet;

import com.rpg.model.utility.characterSheet.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class CharacterSheetDto {


    private String id;
    private Hero hero;
    private HeroDescription description;
    private HeroTraits traits;
    private List<String> weapon;
    private List<HeroArmor> armor;
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

    public static CharacterSheetDto of(
            final String id,
            final Hero hero,
            final HeroDescription description,
            final HeroTraits traits,
            final List<String> weapon,
            final List<HeroArmor> armor,
            final PlayerInfo player,
            final ExperiencePoints experiencePoints,
            final HeroMovement movement,
            final HeroArmorPoints armorPoints,
            final List<HeroSkill> skill,
            final List<HeroAbility> ability,
            final List<HeroEquipment> equipment,
            final HeroMoney money,
            final List<HeroSpell> spell,
            final List<HeroMutation> mutations,
            final String owner) {
        return new CharacterSheetDto(
                id, hero, description, traits, weapon, armor, player, experiencePoints, movement, armorPoints, skill, ability, equipment, money, spell,mutations, owner);
    }

}
