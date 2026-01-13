package com.viniprogr.jwt.infra.repository;

import com.viniprogr.jwt.infra.persistence.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findById(Long id);
    Optional<UserEntity> findByNome(String nome);
}
