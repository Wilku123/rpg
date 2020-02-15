package com.rpg.rpg.controller;

import com.rpg.rpg.dto.equipment.WeaponTraitDto;
import com.rpg.rpg.dto.equipment.WeaponTraitsDto;
import com.rpg.rpg.service.WeaponTraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weaponTrait")
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
}
