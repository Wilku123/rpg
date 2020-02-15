package com.rpg.repository.implementation;

import com.rpg.model.entity.MutationEntity;
import com.rpg.repository.MutationRepository;
import com.rpg.repository.orm.MutationOrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MutationRepositoryImplementation implements MutationRepository {

    @Autowired
    private MutationOrmRepository mutationOrmRepository;

    @Override
    public List<MutationEntity> readAll() {
        return mutationOrmRepository.findAll();
    }

    @Override
    public List<MutationEntity> readByGods(String god) {
        return mutationOrmRepository.findByGod(god);
    }

    @Override
    public List<MutationEntity> readByName(String name) {
        return mutationOrmRepository.findByName(name);
    }

    @Override
    public MutationEntity add(MutationEntity mutationEntity) {
        return mutationOrmRepository.save(mutationEntity);
    }

    @Override
    public MutationEntity readOne(String id) {
        return mutationOrmRepository.findById(id).orElse(null);
    }
}
