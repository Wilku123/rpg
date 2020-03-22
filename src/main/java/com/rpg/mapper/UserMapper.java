package com.rpg.mapper;

import com.rpg.dto.user.UserCreateDto;
import com.rpg.dto.user.UserDto;
import com.rpg.model.entity.UserEntity;
import com.rpg.security.config.AccountRoles;

public class UserMapper {

    public static UserEntity fromDto(final UserCreateDto user) {
        return new UserEntity(
                user.getEmail(),
                user.getPassword(),
                AccountRoles.USER);

    }

    public static UserEntity fromDto(UserDto user) {
        return new UserEntity(

                user.getId(),
                user.getNickname(),
                user.getPassword(),
                user.getEmail(),
                AccountRoles.USER);
    }

    public static UserDto toDto(final UserEntity user) {
        return UserDto.of(
                user.getId(),
                user.getUsername(),
                user.getRole(),
                user.getPassword(),
                user.getEmail());
    }


}
