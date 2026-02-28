package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Entity.Doctor;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.Repository.DoctorRepository;
import com.example.clinicalSystem.dto.DoctorSIgnUpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AccessRepository accessRepository;

    public String addDoctor (DoctorSIgnUpDto dto){
        if(accessRepository.findByEmail(dto.getEmail()) != null){
            return "Email already exit";
        }


        Access access = new Access();
        access.setEmail(dto.getEmail());
        access.setPassword(dto.getPassword());
        access.setUserType("Doctor");
        accessRepository.save(access);

        Doctor doctor= new Doctor();
        doctor.setD_name(dto.getD_name());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setAccess(access);
        doctorRepository.save(doctor);

        return "Doctor added successfully";
    }

    public Doctor getDoctorByAccessId(Long access_id) {
        return doctorRepository.findByAccessId(access_id);
    }
}
