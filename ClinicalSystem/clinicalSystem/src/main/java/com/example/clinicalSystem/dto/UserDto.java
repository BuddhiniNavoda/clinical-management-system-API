package com.example.clinicalSystem.dto;

public class UserDto {

    private String userName;
    private String address;
    private String blood_G;
    private String email;
    private String dob;
    private String gender;

    public UserDto() {}

    public UserDto(String userName, String address, String blood_G, String email, String dob, String gender) {
        this.userName = userName;
        this.address = address;
        this.blood_G = blood_G;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
    }

    // Getters & Setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
