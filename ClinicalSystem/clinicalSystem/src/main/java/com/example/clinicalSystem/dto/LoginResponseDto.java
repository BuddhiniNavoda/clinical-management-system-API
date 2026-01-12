package com.example.clinicalSystem.dto;

public class LoginResponseDto {

    private Long Id;
    private String userType;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
