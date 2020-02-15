package com.rpg.mapper;

import com.rpg.dto.mutation.MutationDto;
import com.rpg.dto.mutation.MutationsDto;
import com.rpg.model.entity.MutationEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class MutationMapper {
    public static MutationEntity fromDto(MutationDto dto) {
        return new MutationEntity(dto.getId(),
                dto.getDice(),
                dto.getGod(),
                dto.getName(),
                dto.getFearPoints(),
                dto.getType(),
                dto.getDescription(),
                dto.getVariants(),
                dto.getMutationEffects(),
                dto.getComments()
        );

    }

    public static MutationDto toDto(MutationEntity mutationEntity) {
        return MutationDto.of(mutationEntity.getId(),
                mutationEntity.getDice(),
                mutationEntity.getGod(),
                mutationEntity.getName(),
                mutationEntity.getFearPoints(),
                mutationEntity.getType(),
                mutationEntity.getDescription(),
                mutationEntity.getVariants(),
                mutationEntity.getMutationEffects(),
                mutationEntity.getComments());
    }

    public static MutationsDto toDto(List<MutationEntity> mutationEntities) {
        return MutationsDto.of(
                mutationEntities
                        .stream()
                        .map(mutation -> MutationDto.of(
                                mutation.getId(),
                                mutation.getDice(),
                                mutation.getGod(),
                                mutation.getName(),
                                mutation.getFearPoints(),
                                mutation.getType(),
                                mutation.getDescription(),
                                mutation.getVariants(),
                                mutation.getMutationEffects(),
                                mutation.getComments()))
                        .collect(Collectors.toList())
        );
    }
}
