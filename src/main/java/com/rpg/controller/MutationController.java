package com.rpg.controller;

import com.rpg.dto.mutation.MutationDto;
import com.rpg.dto.mutation.MutationsDto;
import com.rpg.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
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
    public MutationsDto getByName(@RequestBody MutationDto mutationDto){
        return mutationService.readByName(mutationDto.getName());
    }

    @PostMapping("/add")
    public MutationDto add(@RequestBody MutationDto mutationDto){
        return mutationService.add(mutationDto);
    }
}
