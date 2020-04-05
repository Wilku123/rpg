package com.rpg.repository;

import com.rpg.model.entity.CharacterSheetEntity;

import java.util.List;

public interface CharacterSheetRepository {
    List<CharacterSheetEntity> readByOwner(String owner);
    List<CharacterSheetEntity> readAll();
    boolean exist(String id);
    CharacterSheetEntity add(CharacterSheetEntity characterSheetEntity);


}
