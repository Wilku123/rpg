package com.rpg.rpg.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("weaponTrait")
@Getter
@AllArgsConstructor
public class WeaponTraitEntity {

    @Id
    private String id;
    private String name;
    private String description;
}
