package com.rpg.controller;


import com.rpg.dto.equipment.ArmorDto;
import com.rpg.dto.equipment.ArmorsDto;
import com.rpg.service.ArmorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/armor")
public class ArmorController {

    @Autowired
    private ArmorService armorService;

    @GetMapping("/all")
    public ArmorsDto readAll(){
        return armorService.readAll();
    }

    @GetMapping("/{id}")
    public ArmorDto readOne(@PathVariable String id){
        return armorService.readOne(id);
    }

    @PostMapping("/name")
    public ArmorDto readByName(@RequestBody ArmorDto armorDto){
        return armorService.readByName(armorDto.getName());
    }
}
