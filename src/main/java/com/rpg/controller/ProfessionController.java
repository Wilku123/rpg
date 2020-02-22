package com.rpg.controller;


import com.rpg.dto.profession.ProfessionDto;
import com.rpg.dto.profession.ProfessionsDto;
import com.rpg.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profession")
public class ProfessionController {

    @Autowired
    private ProfessionService professionService;


    @GetMapping("/all")
    public ProfessionsDto getAll(){
        return professionService.readAll();
    }

    @GetMapping("/{id}")
    public ProfessionDto getOne(@PathVariable String id){
        return professionService.readOne(id);

    }
    @PostMapping("/name")
    public ProfessionDto getByName(@RequestBody ProfessionDto professionDto){
        return professionService.readByName(professionDto.getName());
    }
}
