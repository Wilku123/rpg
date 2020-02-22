package com.rpg.repository.implementation;

import com.rpg.repository.orm.ProfessionOrmRepository;
import com.rpg.model.entity.ProfessionEntity;
import com.rpg.repository.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessionRepositoryImplementation implements ProfessionRepository {

    @Autowired
    private ProfessionOrmRepository professionOrmRepository;

    @Override
    public List<ProfessionEntity> readAll() {
        return professionOrmRepository.findAll();
    }

    @Override
    public ProfessionEntity readOne(String id) {
        return professionOrmRepository.findById(id).orElse(null);
    }

    @Override
    public ProfessionEntity readByName(String name) {
        return professionOrmRepository.findByName(name);
    }
}
