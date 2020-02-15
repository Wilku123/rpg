package com.rpg.rpg.service;

import com.rpg.rpg.dto.profession.ProfessionDto;
import com.rpg.rpg.dto.profession.ProfessionsDto;
import com.rpg.rpg.mapper.ProfessionMapper;
import com.rpg.rpg.repository.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionService {

    @Autowired
    private ProfessionRepository professionRepository;

    public ProfessionsDto readAll(){
        return ProfessionMapper.toDto(professionRepository.readAll());
    }

    public ProfessionDto readOne(String id){
        return ProfessionMapper.toDto(professionRepository.readOne(id));
    }

    public ProfessionDto readByName(String name){
        return ProfessionMapper.toDto(professionRepository.readByName(name));
    }
}
