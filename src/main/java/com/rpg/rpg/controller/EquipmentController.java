package com.rpg.rpg.controller;

import com.rpg.rpg.dto.equipment.EquipmentDto;
import com.rpg.rpg.dto.equipment.EquipmentsDto;
import com.rpg.rpg.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;


    @GetMapping("/all")
    public EquipmentsDto getAll(){
        return equipmentService.readAll();
    }
    @GetMapping("/{id}")
    public EquipmentDto getOne(@PathVariable String id){
        return equipmentService.readOne(id);
    }

    @PostMapping("/name")
    public EquipmentDto getByName(@RequestBody EquipmentDto equipmentDto){
        return equipmentService.readByName(equipmentDto.getName());
    }
}
