package com.example.clinicalSystem.Repository;

import com.example.clinicalSystem.Entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessRepository extends JpaRepository<Access,Long> {
    boolean existsByEmail(String email);
    Optional<Access> findByEmail(String email);
}
