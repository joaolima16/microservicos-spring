package com.ms.user.controllers.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record USerRecordDTO(@NotBlank String name, @NotBlank @Email String email) {
    
}
