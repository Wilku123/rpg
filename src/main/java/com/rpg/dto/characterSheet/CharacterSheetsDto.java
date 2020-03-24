package com.rpg.dto.characterSheet;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@Getter
public class CharacterSheetsDto {

    private List<CharacterSheetDto> characterSheetsDtos;
    public static CharacterSheetsDto of(List<CharacterSheetDto> characterSheetsDto){
        return new CharacterSheetsDto(characterSheetsDto);
    }
}
