package com.rpg.dto.user;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDto {
    @NotNull
    @NotEmpty
    private Long id;

    @NotNull
    @NotEmpty
    private final String nickname;

    @NotNull
    @NotEmpty
    private final String role;

    @NotNull
    @NotEmpty
    private final String password;

    @NotNull
    @NotEmpty
    private final String email;

    public static UserDto of(final Long id, final String username,final String role, final String password, final String email) {
        return new UserDto(id, username,role, password,email);
    }
}
