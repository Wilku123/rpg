package com.rpg.repository.orm;

import com.rpg.model.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserOrmRepository extends MongoRepository<UserEntity,String> {
    Boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);
}
