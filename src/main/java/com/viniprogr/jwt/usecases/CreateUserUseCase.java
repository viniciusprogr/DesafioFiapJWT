package com.viniprogr.jwt.usecases;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.domain.gateways.UserRepositoryGateway;

public class CreateUserUseCase {
    private final UserRepositoryGateway userRepositoryGateway;


    public CreateUserUseCase(UserRepositoryGateway userRepositoryGateway) {
        this.userRepositoryGateway = userRepositoryGateway;
    }

    public void execute(User user){
        if(userRepositoryGateway.findByEmail(user.getEmail()).isPresent()){
            throw new IllegalArgumentException("Ja existe um usuario com esse e-mail");
        }

        //user.setSenha(passwordEncoder.encode(user.getSenha()));

        userRepositoryGateway.save(user);
    }
}
