package com.viniprogr.jwt.usecases;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.domain.gateways.PasswordEncoderGateway;
import com.viniprogr.jwt.domain.gateways.UserRepositoryGateway;


public class CreateUserUseCase {

    private final UserRepositoryGateway userRepositoryGateway;
    private final PasswordEncoderGateway passwordEncoderGateway;


    public CreateUserUseCase(UserRepositoryGateway userRepositoryGateway,  PasswordEncoderGateway passwordEncoderGateway) {
        this.userRepositoryGateway = userRepositoryGateway;
        this.passwordEncoderGateway = passwordEncoderGateway;

    }

    public User execute(User user){
        if(userRepositoryGateway.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("E-mail já cadastrado");
        }

        String encodedPassword = passwordEncoderGateway.encode(user.getSenha());
        user.setSenha(encodedPassword);

        return userRepositoryGateway.save(user);
    }
}
