package com.rpg.repository;

import com.rpg.model.entity.MutationEntity;

import java.util.List;

public interface MutationRepository {
    List<MutationEntity> readAll();
    List<MutationEntity> readByGods(String god);
    List<MutationEntity> readByName(String name);
    MutationEntity readOne(String id);
    MutationEntity add(MutationEntity mutationEntity);

}
