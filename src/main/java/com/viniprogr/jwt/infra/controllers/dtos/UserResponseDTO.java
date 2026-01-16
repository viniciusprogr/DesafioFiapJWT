package com.viniprogr.jwt.infra.controllers.dtos;



public record UserResponseDTO(
        Long id,
        String nome,
        String email
){}
