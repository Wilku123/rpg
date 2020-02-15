package com.rpg.service;

import com.rpg.repository.SkillRepository;
import com.rpg.dto.skill.SkillDto;
import com.rpg.dto.skill.SkillsDto;
import com.rpg.mapper.SkillMapper;
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
