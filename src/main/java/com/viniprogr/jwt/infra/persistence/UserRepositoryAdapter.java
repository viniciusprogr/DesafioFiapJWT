package com.viniprogr.jwt.infra.persistence;

import com.viniprogr.jwt.domain.entities.User;
import com.viniprogr.jwt.domain.gateways.UserRepositoryGateway;
import com.viniprogr.jwt.infra.mapper.UserMapper;
import com.viniprogr.jwt.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UserRepositoryAdapter implements UserRepositoryGateway {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserRepositoryAdapter(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public User save(User user) {
        UserEntity userEntity = userMapper.toEntity(user);
        UserEntity userEntitySaved = userRepository.save(userEntity);
        return userMapper.toDomain(userEntitySaved);
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }


    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(u -> userMapper.toDomain(u));
    }


}
