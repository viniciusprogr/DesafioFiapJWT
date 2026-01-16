package com.viniprogr.jwt.infra.controllers.dtos;

public record AuthenticationDTO(
        String email,
        String senha
){}
