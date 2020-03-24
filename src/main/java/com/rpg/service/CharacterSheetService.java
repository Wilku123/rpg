package com.rpg.service;

import com.rpg.dto.characterSheet.CharacterSheetDto;
import com.rpg.dto.characterSheet.CharacterSheetsDto;
import com.rpg.mapper.CharacterSheetMapper;
import com.rpg.repository.CharacterSheetRepository;
import com.rpg.repository.implementation.CharacterSheetRepositoryImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterSheetService {
    @Autowired
    private CharacterSheetRepository characterSheetRepository;

    public CharacterSheetDto readByOwner(final String owner){
        return CharacterSheetMapper.toDto(characterSheetRepository.readByOwner(owner));
    }
    public CharacterSheetsDto readAll(){
        return CharacterSheetMapper.toDto(characterSheetRepository.readAll());
    }
}
