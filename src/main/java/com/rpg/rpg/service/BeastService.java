package com.rpg.rpg.service;


import com.rpg.rpg.dto.beast.BeastDto;
import com.rpg.rpg.dto.beast.BeastsDto;
import com.rpg.rpg.mapper.BeastMapper;
import com.rpg.rpg.repository.BeastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeastService {

    @Autowired
    private BeastRepository beastRepository;

    public BeastDto readOne(String id){
        return BeastMapper.toDto(beastRepository.readOne(id));

    }
    public BeastsDto readAll(){
        return BeastMapper.toDto(beastRepository.readAll());
    }
    public BeastDto readByName(String name){
        return BeastMapper.toDto(beastRepository.readByName(name));
    }
}
