package com.example.clinicalSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long P_Id;
    private String P_name;
    private String dob;
    private String gender;
    private String P_address;
    private String blood_G;

    @OneToOne
    @JoinColumn(name = "access_id")
    private Access access;

    public Patient(){

    }

    public Patient(Long p_Id, String p_name, String dob, String gender, String p_address, String blood_G, Access access) {
        P_Id = p_Id;
        P_name = p_name;
        this.dob = dob;
        this.gender = gender;
        P_address = p_address;
        this.blood_G = blood_G;
        this.access = access;
    }
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

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }




}








