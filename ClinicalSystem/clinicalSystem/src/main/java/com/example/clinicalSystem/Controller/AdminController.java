package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.Service.AdminService;
import com.example.clinicalSystem.dto.DoctorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AccessRepository accessRepository;

    @Autowired
    private AdminService adminService;

    @GetMapping("/profile/{access_id}")
    public Access getAdminProfile(@PathVariable Long access_id){
        return accessRepository.findById(access_id).orElse(null);
    }

    @PostMapping("/add-doctor")
    public String addDoctor(@RequestBody DoctorDto dto){
        return adminService.addDoctor(dto);
    }
}
