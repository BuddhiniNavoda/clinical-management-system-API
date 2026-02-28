package com.example.clinicalSystem.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDate appointmentDate;
    private LocalTime appointmentTime;

    private String patientEmail;

    /*doctor relation*/
    @ManyToOne
    @JoinColumn(name ="doctor_access_id")
    private Access doctorAccess;


    /*patient relation*/
    @ManyToOne
    @JoinColumn(name ="patient_access_id" )
    private Access patientAccess;

    public Access getPatientAccess() {
        return patientAccess;
    }

    public void setPatientAccess(Access patientAccess) {
        this.patientAccess = patientAccess;
    }

    public Access getDoctorAccess(Access doctorAccess) {
        return this.doctorAccess;
    }

    public void setDoctorAccess(Access doctorAccess) {
        this.doctorAccess = doctorAccess;
    }


    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }



    public Appointment(){}

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
