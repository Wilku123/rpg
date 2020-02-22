package com.rpg.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@Document("spell")
public class SpellEntity {

    @Id
    private String id;

    private String typeOfMagic;
    private String domain;
    private String name;
    private String reqPower;
    private String castingTime;
    private String ingredient;
    private String duration;
    private String description;
}
