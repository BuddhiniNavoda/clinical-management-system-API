package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.dto.LoginDto;
import com.example.clinicalSystem.dto.LoginResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private AccessRepository accessRepository;

    public LoginResponseDto login(LoginDto dto ){
        Optional<Access> user = accessRepository.findByEmail(dto.getEmail());

        if(user.isEmpty()){
            throw new RuntimeException("user not found");
        }

        if(!user.get().getPassword().equals(dto.getPassword())){
            throw new RuntimeException("Invalid Passwaord");
        }

        LoginResponseDto responseDto = new LoginResponseDto();
        responseDto.setId(Long.valueOf(Long.valueOf(user.get().getId())));
        responseDto.setUserType(user.get().getUserType());

        return responseDto;
    }


}
