package com.rpg.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@Getter
@Document("armor")
public class ArmorEntity {

    @Id
    private String id;

    private String type;
    private String name;
    private String price;
    private String weight;
    private List<String> location;
    private String armorPoints;
    private String accessibility;
}
