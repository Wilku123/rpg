package com.rpg.controller;

import com.rpg.dto.equipment.WeaponTraitDto;
import com.rpg.dto.equipment.WeaponTraitsDto;
import com.rpg.service.WeaponTraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weaponTrait")
@CrossOrigin
public class WeaponTraitController {

    @Autowired
    private WeaponTraitService weaponTraitService;

    @GetMapping("/all")
    public WeaponTraitsDto getAll(){
        return weaponTraitService.getAll();
    }

    @GetMapping("/{id}")
    public WeaponTraitDto getOne(@PathVariable String id){
        return weaponTraitService.getOne(id);
    }
    @PostMapping("/name")
    public WeaponTraitDto getByName(@RequestBody WeaponTraitDto weaponTraitDto){
        return weaponTraitService.getByName(weaponTraitDto.getName());
    }
}
