package com.rpg.rpg.model.entity;

import com.rpg.rpg.model.utility.MutationEffects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("mutation")
public class MutationEntity {

    @Id private String id;

    private String dice;
    private String god;
    private String name;
    private byte fearPoints;
    private String type;
    private String description;
    private String variants;
    private List<MutationEffects> mutationEffects;
    private String comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDice() {
        return dice;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }

    public String getGod() {
        return god;
    }

    public void setGod(String god) {
        this.god = god;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getFearPoints() {
        return fearPoints;
    }

    public void setFearPoints(byte fearPoints) {
        this.fearPoints = fearPoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVariants() {
        return variants;
    }

    public void setVariants(String variants) {
        this.variants = variants;
    }

    public List<MutationEffects> getMutationEffects() {
        return mutationEffects;
    }

    public void setMutationEffects(List<MutationEffects> mutationEffects) {
        this.mutationEffects = mutationEffects;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public MutationEntity(String id, String dice, String god, String name, byte fearPoints, String type, String description, String variants, List<MutationEffects> mutationEffects, String comments) {
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
}
