package com.rpg.service;

import com.rpg.repository.SpellRepository;
import com.rpg.dto.spell.SpellDto;
import com.rpg.dto.spell.SpellsDto;
import com.rpg.mapper.SpellMapper;
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
