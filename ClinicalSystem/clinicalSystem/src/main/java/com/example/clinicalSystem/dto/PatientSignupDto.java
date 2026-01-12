package com.example.clinicalSystem.dto;

import lombok.Data;

@Data

public class PatientSignupDto {
    private Long P_Id;
    private String P_name;
    private String dob;
    private String gender;
    private String P_address;
    private String blood_G;
    private String email;
    private String password;

    public Long getP_Id() {
        return P_Id;
    }

    public void setP_Id(Long p_Id) {
        P_Id = p_Id;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String p_name) {
        P_name = p_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getP_address() {
        return P_address;
    }

    public void setP_address(String p_address) {
        P_address = p_address;
    }

    public String getBlood_G() {
        return blood_G;
    }

    public void setBlood_G(String blood_G) {
        this.blood_G = blood_G;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
