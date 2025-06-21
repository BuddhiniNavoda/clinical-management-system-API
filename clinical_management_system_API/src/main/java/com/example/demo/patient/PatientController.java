package com.example.demo.patient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {
    @GetMapping("/")
    public List<Patient> getPatient(){
        return List.of(
                new Patient(
                        "John Doe",
                        "P001",
                        "1990-01-01",
                        "male",
                        "No 152, word street,gampaha",
                        " husein1234@gmail.com"
                        ,"O+"));
    }


}
