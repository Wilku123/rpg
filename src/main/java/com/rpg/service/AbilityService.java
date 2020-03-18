package com.rpg.service;

import com.rpg.repository.AbilityRepository;
import com.rpg.dto.ability.AbilitiesDto;
import com.rpg.dto.ability.AbilityDto;
import com.rpg.mapper.AbilityMapper;
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
        return AbilityMapper.toDto(Objects.requireNonNull(abilityRepository.readOne(id)));
    }
    public AbilityDto readByName(String name){
        return AbilityMapper.toDto(Objects.requireNonNull(abilityRepository.readByName(name)));
    }



}
