package com.rpg.controller;

import com.rpg.dto.ability.AbilitiesDto;
import com.rpg.dto.ability.AbilityDto;
import com.rpg.service.AbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ability")
public class AbilityController {

    @Autowired
    private AbilityService abilityService;

    @GetMapping("/all")
    public AbilitiesDto getAll() {
        return abilityService.readAll();
    }

    @GetMapping("/{id}")
    public AbilityDto getOne(@PathVariable String id) {
        return abilityService.readOne(id);
    }

    @PostMapping("/name")
    public AbilityDto getByName(@RequestBody AbilityDto abilityDto) {
        return abilityService.readByName(abilityDto.getName());
    }
}
