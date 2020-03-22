package com.rpg.repository;

import com.rpg.model.entity.UserEntity;

public interface UserRepository {
    UserEntity readById(String id);
    UserEntity readByEmail(String email);
    UserEntity modify(UserEntity userEntity);
}
