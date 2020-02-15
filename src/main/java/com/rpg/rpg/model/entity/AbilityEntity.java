package com.rpg.rpg.model.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ability")
@Getter
public class AbilityEntity {
    @Id
    private String id;
    private String name;
    private String description;
}
