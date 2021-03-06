package com.rpg.dto.equipment;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class ArmorsDto {

    private final List<ArmorDto> armors;

    public static ArmorsDto of(final List<ArmorDto> armors){
        return new ArmorsDto(armors);
    }
}
