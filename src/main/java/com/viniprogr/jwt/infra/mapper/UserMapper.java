package com.viniprogr.jwt.infra.mapper;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.infra.persistence.UserEntity;
import com.viniprogr.jwt.infra.controllers.dtos.UserRequestDTO;
import com.viniprogr.jwt.infra.controllers.dtos.UserResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // Mapeamento manual para o RequestDTO (Record)
    public User toDomain(UserRequestDTO dto) {
        return new User(
                null,
                dto.nome(),
                dto.email(),
                dto.senha(),
                dto.role()
        );
    }

    // Mapeamento manual para o ResponseDTO (Record) - Resolve o seu erro!
    public UserResponseDTO toResponse(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getNome(),
                user.getEmail()
        );
    }

    // Para a Entidade, você pode continuar usando o ModelMapper se preferir
    public User toDomain(UserEntity entity) {
        return modelMapper.map(entity, User.class);
    }

    public UserEntity toEntity(User user) {
        return modelMapper.map(user, UserEntity.class);
    }
}