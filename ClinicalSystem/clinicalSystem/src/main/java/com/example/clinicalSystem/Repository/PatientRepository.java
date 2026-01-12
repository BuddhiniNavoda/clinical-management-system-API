package com.example.clinicalSystem.Repository;

import com.example.clinicalSystem.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
