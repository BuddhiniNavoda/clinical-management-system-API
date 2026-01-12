package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Entity.Patient;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.Repository.PatientRepository;
import com.example.clinicalSystem.dto.PatientSignupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private AccessRepository accessRepository;

    @Autowired
    private PatientRepository patientRepository;

    public String signupPatient(PatientSignupDto dto){
        if(accessRepository.findByEmail(dto.getEmail()) != null){
            return "Email already exists";
        }
        Access access = new Access ();
        access.setEmail(dto.getEmail());
        access.setPassword(dto.getPassword());
        access.setUserType("Patient");
        accessRepository.save(access);

        Patient patient = new Patient();
        patient.setP_name(dto.getP_name());
        patient.setDob(dto.getDob());
        patient.setP_address(dto.getP_address());
        patient.setBlood_G(dto.getBlood_G());
        patient.setGender(dto.getGender());
        patient.setAccess(access);

        patientRepository.save(patient);

        return "patient Registered successfully";
    }
}
