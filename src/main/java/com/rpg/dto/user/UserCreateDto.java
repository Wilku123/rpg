package com.rpg.dto.user;


import com.rpg.utility.annotations.PasswordMatcher;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
@Getter
@PasswordMatcher
public class UserCreateDto {
    @NotNull
    @NotEmpty
    private final String email;

    @NotNull
    @NotEmpty
    private final String password;

    @NotNull
    @NotEmpty
    private final String confirmPassword;

    public static UserCreateDto of(final String email, final String password, final String confirmPassword) {
        return new UserCreateDto(email, password, confirmPassword);
    }
}
