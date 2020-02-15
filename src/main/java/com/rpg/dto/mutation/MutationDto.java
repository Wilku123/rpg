package com.rpg.dto.mutation;

import com.mongodb.lang.Nullable;
import com.rpg.model.utility.MutationEffects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public final class MutationDto {

    @NotNull
    private String id;

    @NotNull
    @NotEmpty
    private String dice;

    @Nullable
    private String god;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private byte fearPoints;

    @NotNull
    @NotEmpty
    private String type;

    @NotNull
    @NotEmpty
    private String description;

    @Nullable
    private String variants;

    @Nullable
    private List<MutationEffects> mutationEffects;

    @Nullable
    private String comments;

    public String getId() {
        return id;
    }

    public String getDice() {
        return dice;
    }

    @Nullable
    public String getGod() {
        return god;
    }

    public String getName() {
        return name;
    }

    public byte getFearPoints() {
        return fearPoints;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Nullable
    public String getVariants() {
        return variants;
    }

    @Nullable
    public List<MutationEffects> getMutationEffects() {
        return mutationEffects;
    }

    @Nullable
    public String getComments() {
        return comments;
    }

    private MutationDto() {
    }

    private MutationDto(String id, String dice, String god, @NotNull @NotEmpty String name, @NotNull @NotEmpty byte fearPoints, @NotNull @NotEmpty String type, @NotNull @NotEmpty String description, @Nullable String variants, @Nullable List<MutationEffects> mutationEffects, @Nullable String comments) {
        this.id = id;
        this.dice = dice;
        this.god = god;
        this.name = name;
        this.fearPoints = fearPoints;
        this.type = type;
        this.description = description;
        this.variants = variants;
        this.mutationEffects = mutationEffects;
        this.comments = comments;
    }

    public static MutationDto of(
            final String id,
            final String dice,
            final String god,
            final String name,
            final byte fearPoints,
            final String type,
            final String description,
            final String variants,
            final List<MutationEffects> mutationEffects,
            final String comments) {
        return new MutationDto(id, dice, god, name, fearPoints, type, description, variants, mutationEffects, comments);
    }

}
