package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Service.AdminService;
import com.example.clinicalSystem.dto.DoctorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/add-doctor")
    public String addDoctor(@RequestBody DoctorDto dto){
        return adminService.addDoctor(dto);
    }
}
