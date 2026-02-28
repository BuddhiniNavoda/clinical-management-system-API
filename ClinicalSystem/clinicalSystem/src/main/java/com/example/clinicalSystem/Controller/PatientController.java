package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Entity.Patient;
import com.example.clinicalSystem.Service.PatientService;
import com.example.clinicalSystem.dto.PatientSignupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody PatientSignupDto dto){

       String result = patientService.signupPatient(dto);
        if (result.equals("Email already exists")) {
            return ResponseEntity.badRequest().body(result);
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/profile/{access_id}")
    public Patient getPatientProfile(@PathVariable Long access_id){
        return patientService.getPatientByAccessId(access_id);

    }
}
