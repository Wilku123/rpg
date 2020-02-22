package com.rpg.controller;


import com.rpg.dto.equipment.WeaponDto;
import com.rpg.dto.equipment.WeaponsDto;
import com.rpg.dto.util.NameDto;
import com.rpg.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/weapon")
public class WeaponController {

    @Autowired
    private WeaponService weaponService;

    @GetMapping("/all")
    public WeaponsDto getAll() {
        return weaponService.readAll();
    }

    @GetMapping("/{id}")
    public WeaponDto getOne(@PathVariable String id) {
        return weaponService.readOne(id);
    }

    @PostMapping("/name")
    public WeaponDto getByName(@RequestBody NameDto name) {
        return weaponService.readByName(name);
    }
}
