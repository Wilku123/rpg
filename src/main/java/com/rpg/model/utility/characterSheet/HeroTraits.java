package com.rpg.model.utility.characterSheet;

import com.rpg.model.utility.MainTraits;
import com.rpg.model.utility.SecondaryTraits;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeroTraits {
    private MainTraits mainTraits;
    private SecondaryTraits secondaryTraits;
    private MainTraits professionMainTraits;
    private SecondaryTraits professionSecondaryTraits;
    private MainTraits currentCharacterMainTraits;
    private SecondaryTraits currentCharacterSecondaryTraits;
    private boolean everythingDone;

}
