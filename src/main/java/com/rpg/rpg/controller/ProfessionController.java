package com.rpg.rpg.controller;


import com.rpg.rpg.dto.profession.ProfessionDto;
import com.rpg.rpg.dto.profession.ProfessionsDto;
import com.rpg.rpg.service.ProfessionService;
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
    public ProfessionDto getByName(@RequestBody String name){
        return professionService.readByName(name);
    }
}
