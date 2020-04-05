package com.rpg.service;

import com.rpg.dto.characterSheet.CharacterSheetDto;
import com.rpg.dto.characterSheet.CharacterSheetsDto;
import com.rpg.mapper.CharacterSheetMapper;
import com.rpg.model.utility.MainTraits;
import com.rpg.model.utility.SecondaryTraits;
import com.rpg.repository.CharacterSheetRepository;
import com.rpg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class CharacterSheetService {
    @Autowired
    private CharacterSheetRepository characterSheetRepository;

    @Autowired
    private UserRepository userRepository;

    public CharacterSheetsDto readByOwner(String owner){

        String id = userRepository.readByEmail(owner).getId();

        return CharacterSheetMapper.toDto(characterSheetRepository.readByOwner(id));
    }
    public CharacterSheetsDto readAll(){
        return CharacterSheetMapper.toDto(characterSheetRepository.readAll());
    }
    public boolean exist(final String id){
        return characterSheetRepository.exist(id);
    }
    public CharacterSheetDto add(CharacterSheetDto characterSheetDto){
        return CharacterSheetMapper.toDto(characterSheetRepository.add(CharacterSheetMapper.fromDto(characterSheetDto)));
    }
}
