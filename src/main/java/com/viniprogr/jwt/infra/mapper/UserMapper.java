package com.viniprogr.jwt.infra.mapper;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.infra.persistence.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper  {

    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    public User toDomain(UserEntity userEntity){
        return modelMapper.map(userEntity, User.class);
    }

    public UserEntity toEntity(User user){
        return modelMapper.map(user, UserEntity.class);
    }

    

}
