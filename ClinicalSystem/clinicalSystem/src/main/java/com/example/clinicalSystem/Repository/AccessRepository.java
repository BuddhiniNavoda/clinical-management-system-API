package com.example.clinicalSystem.Repository;

import com.example.clinicalSystem.Entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessRepository extends JpaRepository<Access,Long> {
    Access findByEmail(String emil);

}
