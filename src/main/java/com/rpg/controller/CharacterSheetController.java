package com.rpg.controller;

import com.rpg.dto.characterSheet.CharacterSheetDto;
import com.rpg.dto.characterSheet.CharacterSheetsDto;
import com.rpg.service.CharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user/characterSheet")
public class CharacterSheetController {

    @Autowired
    private CharacterSheetService characterSheetService;

    @GetMapping("/all")
    public CharacterSheetsDto getAll(){
        return characterSheetService.readAll();
    }
    @PostMapping("/owner")
    public CharacterSheetDto getByOwner(@RequestBody CharacterSheetDto characterSheetDto){
        return characterSheetService.readByOwner(characterSheetDto.getOwner());
    }


}
