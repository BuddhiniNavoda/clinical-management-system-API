package com.example.clinicalSystem.Repository;

import com.example.clinicalSystem.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,
        Long> {
}
