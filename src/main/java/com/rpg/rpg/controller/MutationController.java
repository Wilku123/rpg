package com.rpg.rpg.controller;

import com.rpg.rpg.dto.mutation.MutationDto;
import com.rpg.rpg.dto.mutation.MutationsDto;
import com.rpg.rpg.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mutation")
public class MutationController {
    @Autowired
    private MutationService mutationService;

    @GetMapping("/all")
    public MutationsDto getAll(){
        return mutationService.readAll();
    }

    @GetMapping("/{id}")
    public MutationDto getOne( @PathVariable String id){
        return mutationService.readOne(id);
    }
    @PostMapping("/name")
    public MutationsDto getByName(@RequestBody String name){
        return mutationService.readByName(name);
    }

    @PostMapping("/add")
    public MutationDto add(@RequestBody MutationDto mutationDto){
        return mutationService.add(mutationDto);
    }
}
