package com.rpg.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document("equipment")
public class EquipmentEntity {

    @Id
    private String id;

    private String type;
    private String name;
    private String price;
    private String weight;
    private String accessibility;

}
