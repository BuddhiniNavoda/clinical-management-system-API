package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Service.AuthService;
import com.example.clinicalSystem.dto.LoginDto;
import com.example.clinicalSystem.dto.LoginResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login (@RequestBody LoginDto dto){
     LoginResponseDto responseDto = authService.login(dto);
     return ResponseEntity.ok(responseDto);

    }
}
