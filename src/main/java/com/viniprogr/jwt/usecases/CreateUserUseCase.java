package com.viniprogr.jwt.usecases;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.domain.gateways.UserRepositoryGateway;

public class CreateUserUseCase {

    private final UserRepositoryGateway userRepositoryGateway;


    public CreateUserUseCase(UserRepositoryGateway userRepositoryGateway) {
        this.userRepositoryGateway = userRepositoryGateway;
    }

    public User execute(User user){
        if(userRepositoryGateway.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("E-mail já cadastrado");
        }

        return userRepositoryGateway.save(user);
    }
}
