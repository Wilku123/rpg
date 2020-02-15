package com.rpg.rpg.service;

import com.rpg.rpg.dto.ability.AbilitiesDto;
import com.rpg.rpg.dto.ability.AbilityDto;
import com.rpg.rpg.mapper.AbilityMapper;
import com.rpg.rpg.repository.AbilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AbilityService {

    @Autowired
    private AbilityRepository abilityRepository;

    public AbilitiesDto readAll(){
        return AbilityMapper.toDto(abilityRepository.readAll());
    }
    public AbilityDto readOne(String id){
        return AbilityMapper.toDto(Objects.requireNonNull(abilityRepository.readOne(id).orElse(null)));
    }
    public AbilityDto readByName(String name){
        return AbilityMapper.toDto(abilityRepository.readByName(name));
    }



}
