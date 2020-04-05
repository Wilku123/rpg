package com.rpg.controller;

import com.rpg.dto.characterSheet.CharacterSheetDto;
import com.rpg.dto.characterSheet.CharacterSheetsDto;
import com.rpg.service.CharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user/sheet")
public class CharacterSheetController {

    @Autowired
    private CharacterSheetService characterSheetService;

    @GetMapping("/all")
    public CharacterSheetsDto getAll(){
        return characterSheetService.readAll();
    }
    @GetMapping("/owner")
    public CharacterSheetsDto getByOwner(Authentication authentication){
        return characterSheetService.readByOwner(authentication.getName());
    }
    @PostMapping("/exist")
    public boolean getExist(@RequestBody CharacterSheetDto characterSheetDto){
        return characterSheetService.exist(characterSheetDto.getOwner());
    }
    @PostMapping("/add")
    public CharacterSheetDto add(@RequestBody CharacterSheetDto characterSheetDto){
        return characterSheetService.add(characterSheetDto);
    }
}
