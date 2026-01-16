package com.viniprogr.jwt.infra.controllers;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.infra.controllers.dtos.UserRequestDTO;
import com.viniprogr.jwt.infra.controllers.dtos.UserResponseDTO;
import com.viniprogr.jwt.infra.mapper.UserMapper;
import com.viniprogr.jwt.usecases.CreateUserUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final UserMapper userMapper;

    public UserController(CreateUserUseCase createUserUseCase, UserMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.userMapper = userMapper;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequestDTO) {
        User userDomain = userMapper.toDomain(userRequestDTO);
        User savedUser = createUserUseCase.execute(userDomain);
        return ResponseEntity.ok(userMapper.toResponse(savedUser));
    }
}
