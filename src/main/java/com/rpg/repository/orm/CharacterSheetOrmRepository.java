package com.rpg.repository.orm;

import com.rpg.model.entity.CharacterSheetEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CharacterSheetOrmRepository extends MongoRepository<CharacterSheetEntity,String> {
    CharacterSheetEntity findByOwner(String owner);
    List<CharacterSheetEntity> findAll();
}
