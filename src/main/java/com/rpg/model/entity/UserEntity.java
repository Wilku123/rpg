package com.rpg.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
@Getter
@AllArgsConstructor
public class UserEntity {

    @Id
    private long id;
    private String username;
    private String role;
    private String password;
    private String email;

    public UserEntity(String email, String password, String role) {
        this.role = role;
        this.password = password;
        this.email = email;
    }
}

