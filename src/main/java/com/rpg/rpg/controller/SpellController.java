package com.rpg.rpg.controller;

import com.rpg.rpg.dto.spell.SpellDto;
import com.rpg.rpg.dto.spell.SpellsDto;
import com.rpg.rpg.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spell")
public class SpellController {

    @Autowired
    private SpellService spellService;


    @GetMapping("/all")
    public SpellsDto getAll(){
        return spellService.readAll();
    }
    @GetMapping("/{id}")
    public SpellDto getOne(@PathVariable String id){
        return spellService.readOne(id);
    }

    @PostMapping("/name")
    public SpellDto getByName(@RequestBody String name){
        return spellService.readByName(name);
    }

}
