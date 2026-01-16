package com.viniprogr.jwt.domain.gateways;

import com.viniprogr.jwt.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryGateway {
    User save(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);
}
