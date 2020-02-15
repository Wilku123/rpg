package com.rpg.rpg.service;

import com.rpg.rpg.dto.spell.SpellDto;
import com.rpg.rpg.dto.spell.SpellsDto;
import com.rpg.rpg.mapper.SpellMapper;
import com.rpg.rpg.repository.SpellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpellService {

    @Autowired
    private SpellRepository spellRepository;

    public SpellsDto readAll(){
        return SpellMapper.toDto(spellRepository.readAll());
    }

    public SpellDto readOne(String id){
        return SpellMapper.toDto(spellRepository.readOne(id));
    }

    public SpellDto readByName(String name){
        return SpellMapper.toDto(spellRepository.readByName(name));
    }
}
