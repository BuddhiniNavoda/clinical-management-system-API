package com.example.clinicalSystem.dto;

import com.example.clinicalSystem.Entity.Access;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data

public class DoctorDto {

    private Long D_Id;
    private String D_name;
    private String specialization;
    private String email;
    private String password;

    public DoctorDto(Long d_Id, String d_name, String specialization, String email, String password, Access access) {
        D_Id = d_Id;
        D_name = d_name;
        this.specialization = specialization;
        this.email = email;
        this.password = password;
        this.access = access;
    }


    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    @OneToOne
    @JoinColumn(name = "access_id")
    private Access access;

    public Long getD_Id() {
        return D_Id;
    }

    public void setD_Id(Long d_Id) {
        D_Id = d_Id;
    }

    public String getD_name() {
        return D_name;
    }

    public void setD_name(String d_name) {
        D_name = d_name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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
