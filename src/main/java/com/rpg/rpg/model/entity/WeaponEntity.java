package com.rpg.rpg.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("weapon")
@Getter
@AllArgsConstructor
public class WeaponEntity {

    @Id
    private String id;
    private String name;
    private String price;
    private String weight;
    private String category;
    private String rangeMin;
    private String rangeMax;
    private String reload;
    private String strength;
    private List<WeaponTraitEntity> weaponTrait;
    private String accessibility;


}
