package com.rpg.repository.implementation;

import com.rpg.model.entity.UserEntity;
import com.rpg.repository.UserRepository;
import com.rpg.repository.orm.UserOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImplementation implements UserRepository {
    @Autowired
    private UserOrmRepository userOrmRepository;

    @Override
    public UserEntity readById(String id) {
        return userOrmRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity readByEmail(String email) {
        return userOrmRepository.findByEmail(email).orElse(null);
    }

    @Override
    public UserEntity modify(UserEntity userEntity) {
        return userOrmRepository.save(userEntity);
    }
}
