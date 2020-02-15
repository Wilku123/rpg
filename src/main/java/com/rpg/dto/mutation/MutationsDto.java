package com.rpg.dto.mutation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class MutationsDto {

    @NotNull
    private final List<MutationDto> mutationDtos;

    public static MutationsDto of(
            final List<MutationDto> mutationDtos){
        return new MutationsDto(mutationDtos);
    }

}
