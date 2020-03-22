package com.rpg.controller;

import com.rpg.dto.spell.SpellDto;
import com.rpg.dto.spell.SpellsDto;
import com.rpg.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/spell")
@CrossOrigin
public class SpellController {

    @Autowired
    private SpellService spellService;

    @GetMapping("/all")
    public SpellsDto getAll() {
        return spellService.readAll();
    }

    @GetMapping("/{id}")
    public SpellDto getOne(@PathVariable String id) {
        return spellService.readOne(id);
    }

    @PostMapping("/name")
    public SpellDto getByName(@RequestBody SpellDto spellDto) {
        return spellService.readByName(spellDto.getName());
    }

}
