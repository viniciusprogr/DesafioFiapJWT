package com.viniprogr.jwt.infra.persistence.mapper;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.infra.persistence.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toDomain(UserEntity userEntity){
        return new User(
                userEntity.getId(),
                userEntity.getNome(),
                userEntity.getEmail(),
                userEntity.getSenha(),
                userEntity.getRole()
        );
    }

    public UserEntity toEntity(User user){
        return new UserEntity(
                user.getId(),
                user.getNome(),
                user.getEmail(),
                user.getSenha(),
                null
        );
    }

    

}
