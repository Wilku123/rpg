package com.rpg.rpg.service;

import com.rpg.rpg.dto.skill.SkillDto;
import com.rpg.rpg.dto.skill.SkillsDto;
import com.rpg.rpg.mapper.SkillMapper;
import com.rpg.rpg.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public SkillsDto readAll(){
        return SkillMapper.toDto(skillRepository.readAll());
    }
    public SkillDto readOne(String id){
        return SkillMapper.toDto(skillRepository.readOne(id));
    }
    public SkillsDto readByName(String name){
        return SkillMapper.toDto(skillRepository.readByName(name));
    }
}
