package com.rpg.rpg.dto.profession;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class ProfessionsDto {

    @NotNull
    @NotEmpty
    private List<ProfessionDto> professionDtoList;

    public static ProfessionsDto of(
            final List<ProfessionDto> professionDtos
    ){
        return new ProfessionsDto(professionDtos);
    }
}
