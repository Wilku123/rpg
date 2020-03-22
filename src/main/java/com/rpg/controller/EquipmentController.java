package com.rpg.controller;

import com.rpg.dto.equipment.EquipmentDto;
import com.rpg.dto.equipment.EquipmentsDto;
import com.rpg.dto.util.NameDto;
import com.rpg.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/book/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/all")
    public EquipmentsDto getAll() {
        return equipmentService.readAll();
    }

    @GetMapping("/{id}")
    public EquipmentDto getOne(@PathVariable String id) {
        return equipmentService.readOne(id);
    }

    @PostMapping("/name")
    public EquipmentDto getByName(@RequestBody final NameDto name) {
        return equipmentService.readByName(name);
    }
}
