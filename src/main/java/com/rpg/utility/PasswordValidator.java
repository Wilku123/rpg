package com.rpg.utility;

import com.rpg.dto.user.UserCreateDto;
import com.rpg.utility.annotations.PasswordMatcher;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordMatcher, UserCreateDto> {
    @Override
    public void initialize(PasswordMatcher constraintAnnotation) {

    }

    @Override
    public boolean isValid(UserCreateDto userCreateDto, ConstraintValidatorContext constraintValidatorContext) {
        return userCreateDto.getPassword().equals(userCreateDto.getConfirmPassword());
    }
}
