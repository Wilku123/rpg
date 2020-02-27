package com.rpg.dto.beast;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@Getter
public class BeastsDto {

    private List<BeastDto> beastDtos;

    public static BeastsDto of(List<BeastDto> beastsDtos){
        return new BeastsDto(beastsDtos);
    }
}
