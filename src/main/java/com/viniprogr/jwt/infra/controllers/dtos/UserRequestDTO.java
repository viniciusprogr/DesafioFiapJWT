package com.viniprogr.jwt.infra.controllers.dtos;

import com.viniprogr.jwt.domain.entities.UserRole;

public record UserRequestDTO(
        String nome,
        String email,
        String senha,
        UserRole role
){}
