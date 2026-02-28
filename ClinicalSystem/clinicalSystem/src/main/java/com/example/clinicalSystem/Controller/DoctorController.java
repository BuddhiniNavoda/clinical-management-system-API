package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Entity.Doctor;
import com.example.clinicalSystem.Repository.DoctorRepository;
import com.example.clinicalSystem.Service.DoctorService;
import com.example.clinicalSystem.dto.DoctorDto;
import com.example.clinicalSystem.dto.DoctorListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "http://localhost:3000")

public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/profile/{access_id}")
    public Doctor getDoctorProfile(@PathVariable Long access_id){
        return doctorService.getDoctorByAccessId(access_id);
    }

    @GetMapping("/viewdoctors")
    public List<DoctorListDto> getAllDoctors(){

        List<Doctor> doctors = doctorRepository.findAll();

        return doctors.stream()
                .map( d-> new DoctorListDto(d.getD_Id(),d.getD_name(),d.getSpecialization()))
                .collect(Collectors.toList());

    }
}
