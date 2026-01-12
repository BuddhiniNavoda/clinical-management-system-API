package com.example.clinicalSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long D_Id;
    private String D_name;
    private String specialization;

    @OneToOne
    @JoinColumn(name="access_id")
    private Access access;

    public Doctor(){

    }
    public Doctor(Long d_Id, String d_name, String specialization, Access access) {
        D_Id = d_Id;
        D_name = d_name;
        this.specialization = specialization;
        this.access = access;
    }


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

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }


}
