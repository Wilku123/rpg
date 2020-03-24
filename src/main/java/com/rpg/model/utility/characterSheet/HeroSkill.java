package com.rpg.model.utility.characterSheet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeroSkill {
    private String name;
    private boolean boughtOnce;
    private boolean boughtTwice;
    private boolean boughtThrice;
    private String relAbility;
}
