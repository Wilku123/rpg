package com.rpg.dto.profession;


import com.rpg.model.entity.*;
import com.rpg.model.utility.MainTraits;
import com.rpg.model.utility.SecondaryTraits;
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
    final private String id;

    @NotNull
    @NotEmpty
    final private String name;

    @NotNull
    @NotEmpty
    final private String description;

    @NotNull
    @NotEmpty
    final private MainTraits mainTraits;

    @NotNull
    @NotEmpty
    private SecondaryTraits secondaryTraits;
    private List<String> skillList;
    private List<String> abilityList;
    private List<String> weaponList;
    private List<String> armorList;
    private List<String> equipmentList;
    private List<String> inputProf;
    private List<String> outputProf;
    private String img;
    private String comment;

    public static ProfessionDto of(
            final String id,
            final String name,
            final String description,
            final MainTraits mainTraits,
            final SecondaryTraits secondaryTraits,
            final List<String> skillEntities,
            final List<String> abilityList,
            final List<String> weaponList,
            final List<String> armorList,
            final List<String> equipmentList,
            final List<String> inputProf,
            final List<String> outputProf,
            final String img,
            final String comment
    ) {
        return new ProfessionDto(
                id, name, description, mainTraits, secondaryTraits,
                skillEntities, abilityList, weaponList, armorList,
                equipmentList, inputProf, outputProf,img, comment);
    }
}
