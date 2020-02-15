package com.rpg.rpg.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("skill")
public class SkillEntity {

    @Id
    private String id;
    private String name;
    private String type;
    private String trait;
    private String description;
    private String relAbility;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelAbility() {
        return relAbility;
    }

    public void setRelAbility(String relAbility) {
        this.relAbility = relAbility;
    }

    public SkillEntity(String id, String name, String type, String trait, String description, String relAbility) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.trait = trait;
        this.description = description;
        this.relAbility = relAbility;
    }
}
