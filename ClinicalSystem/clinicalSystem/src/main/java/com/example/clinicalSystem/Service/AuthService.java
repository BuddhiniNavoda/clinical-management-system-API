package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.dto.LoginDto;
import com.example.clinicalSystem.dto.LoginResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AccessRepository accessRepository;

    public LoginResponseDto login(LoginDto dto ){
        Access user = accessRepository.findByEmail(dto.getEmail());

        if(user == null){
            throw new RuntimeException("user not found");
        }

        if(!user.getPassword().equals(dto.getPassword())){
            throw new RuntimeException("Invalid Passwaord");
        }

        LoginResponseDto responseDto = new LoginResponseDto();
        responseDto.setId(Long.valueOf(Long.valueOf(user.getId())));
        responseDto.setUserType(user.getUserType());

        return responseDto;
    }


}
