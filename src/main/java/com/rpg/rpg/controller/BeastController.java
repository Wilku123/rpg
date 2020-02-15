package com.rpg.rpg.controller;


import com.rpg.rpg.dto.beast.BeastDto;
import com.rpg.rpg.dto.beast.BeastsDto;
import com.rpg.rpg.service.BeastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beast")
public class BeastController {

    @Autowired
    private BeastService beastService;


    @GetMapping("/all")
    public BeastsDto getAll(){
        return beastService.readAll();
    }
    @GetMapping("/{id}")
    public BeastDto getOne(@PathVariable String id){
        return beastService.readOne(id);
    }
    @PostMapping("/name")
    public BeastDto getByName(@RequestBody String name){
        return beastService.readByName(name);
    }

}
