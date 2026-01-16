package com.viniprogr.jwt.infra.config;

import com.viniprogr.jwt.domain.gateways.PasswordEncoderGateway;
import com.viniprogr.jwt.domain.gateways.UserRepositoryGateway;
import com.viniprogr.jwt.usecases.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserRepositoryGateway userRepositoryGateway, PasswordEncoderGateway passwordEncoderGateway) {
        return new CreateUserUseCase(userRepositoryGateway, passwordEncoderGateway);
    }
}
