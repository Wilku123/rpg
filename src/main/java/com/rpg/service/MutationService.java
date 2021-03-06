package com.rpg.service;

import com.rpg.repository.MutationRepository;
import com.rpg.dto.mutation.MutationDto;
import com.rpg.dto.mutation.MutationsDto;
import com.rpg.mapper.MutationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MutationService {

    @Autowired
    private MutationRepository mutationRepository;

    public MutationsDto readAll(){
        return MutationMapper.toDto(mutationRepository.readAll());
    }
    public MutationDto readOne(String id){
        return MutationMapper.toDto(mutationRepository.readOne(id));
    }

    public MutationsDto readByGod(String god){
        return MutationMapper.toDto(mutationRepository.readByGods(god));

    }
    public MutationsDto readByName(String name){
        return MutationMapper.toDto(mutationRepository.readByName(name));
    }

    public MutationDto add(MutationDto mutationDto){
        return MutationMapper.toDto(mutationRepository.add(MutationMapper.fromDto(mutationDto)));
    }
}
