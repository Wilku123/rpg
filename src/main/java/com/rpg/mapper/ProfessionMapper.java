package com.rpg.mapper;

import com.rpg.dto.profession.ProfessionDto;
import com.rpg.dto.profession.ProfessionsDto;
import com.rpg.model.entity.ProfessionEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProfessionMapper {

    public static ProfessionsDto toDto(List<ProfessionEntity> professionEntities){
        return ProfessionsDto.of(professionEntities.stream().map(prof-> ProfessionDto.of(
                prof.getId(),
                prof.getName(),
                prof.getDescription(),
                prof.getMainTraits(),
                prof.getSecondaryTraits(),
                prof.getSkillList(),
                prof.getAbilityList(),
                prof.getWeaponList(),
                prof.getArmorList(),
                prof.getEquipmentList(),
                prof.getInputProf(),
                prof.getOutputProf()
        )).collect(Collectors.toList()));
    }

    public static ProfessionDto toDto(ProfessionEntity professionEntity){
        return ProfessionDto.of( professionEntity.getId(),
                professionEntity.getName(),
                professionEntity.getDescription(),
                professionEntity.getMainTraits(),
                professionEntity.getSecondaryTraits(),
                professionEntity.getSkillList(),
                professionEntity.getAbilityList(),
                professionEntity.getWeaponList(),
                professionEntity.getArmorList(),
                professionEntity.getEquipmentList(),
                professionEntity.getInputProf(),
                professionEntity.getOutputProf());
    }
    public static ProfessionEntity fromDto(ProfessionDto professionDto){

        return new ProfessionEntity(professionDto.getId(),
                professionDto.getName(),
                professionDto.getDescription(),
                professionDto.getMainTraits(),
                professionDto.getSecondaryTraits(),
                professionDto.getSkillList(),
                professionDto.getAbilityList(),
                professionDto.getWeaponList(),
                professionDto.getArmorList(),
                professionDto.getEquipmentList(),
                professionDto.getInputProf(),
                professionDto.getOutputProf());
    }
}
