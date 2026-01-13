package com.viniprogr.jwt.domain.gateways;

import com.viniprogr.jwt.domain.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryGateway {
    User save(User user);

    List<User> findAll();

    Optional<User> findById(UUID id);

    Optional<User> findByEmail(String email);
}
