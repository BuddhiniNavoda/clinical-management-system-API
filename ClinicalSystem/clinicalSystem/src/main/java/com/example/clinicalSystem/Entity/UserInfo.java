package com.example.clinicalSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long userId;

    private String userName ;
    private String address;
    private String blood_G;
    private String email;
    private String dob;
    private String gender;



    public UserInfo(){
    }

    public UserInfo(String userName, String address, String blood_G, String email, String dob, String gender) {
        this.userName = userName;
        this.address = address;
        this.blood_G = blood_G;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
