package com.rpg.repository.implementation;

import com.rpg.model.entity.CharacterSheetEntity;
import com.rpg.repository.CharacterSheetRepository;
import com.rpg.repository.orm.CharacterSheetOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CharacterSheetRepositoryImplementation  implements CharacterSheetRepository {

    @Autowired
    private CharacterSheetOrmRepository characterSheetOrmRepository;

    @Override
    public CharacterSheetEntity readByOwner(String owner) {
        return characterSheetOrmRepository.findByOwner(owner);
    }

    @Override
    public List<CharacterSheetEntity> readAll() {
        return characterSheetOrmRepository.findAll();
    }

    @Override
    public boolean exist(String id) {
        return characterSheetOrmRepository.existsByOwner(id);
    }
}
