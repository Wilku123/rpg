package com.rpg.controller;

import com.rpg.dto.skill.SkillDto;
import com.rpg.dto.skill.SkillsDto;
import com.rpg.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/skill")
@RestController
@CrossOrigin
public class SkillController {

    @Autowired
    SkillService skillService;

    @GetMapping("/all")
    public SkillsDto getAll() {
        return skillService.readAll();
    }

    @GetMapping("/{id}")
    public SkillDto getOne(@PathVariable String id) {
        return skillService.readOne(id);
    }

    @PostMapping("/name")
    public SkillDto getByName(@RequestBody SkillDto skillDto) {
        return skillService.readByName(skillDto.getName());
    }
}
