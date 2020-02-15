package com.rpg.rpg.repository.orm;

import com.rpg.rpg.model.entity.MutationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MutationOrmRepository extends MongoRepository<MutationEntity, String> {
    List<MutationEntity> findAll();
    List<MutationEntity> findByGod(String god);
    List<MutationEntity> findByName(String name);
    MutationEntity save(MutationEntity mutationEntity);
    Optional<MutationEntity> findById(String id);
}
