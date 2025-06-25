
package com.example.demo.patient;


import jakarta.persistence.*;

@Entity
@Table
public class Patient {
    @Id
    @SequenceGenerator(
            name ="patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    private String P_name;
    private String P_id;
    private String P_DOB;
    private String gender;
    private String address;
    private String P_email;
    private String blood_G;

    public Patient(String p_name, String p_id, String p_DOB, String gender, String address, String p_email, String blood_G) {
        this.P_name = p_name;
        this.P_id = p_id;
        this.P_DOB = p_DOB;
        this.gender = gender;
        this.address = address;
        this.P_email = p_email;
        this.blood_G = blood_G;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String p_name) {
        P_name = p_name;
    }

    public String getP_id() {
        return P_id;
    }

    public void setP_id(String p_id) {
        P_id = p_id;
    }

    public String getP_DOB() {
        return P_DOB;
    }

    public void setP_DOB(String p_DOB) {
        P_DOB = p_DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getP_email() {
        return P_email;
    }

    public void setP_email(String p_email) {
        P_email = p_email;
    }

    public String getBlood_G() {
        return blood_G;
    }

    public void setBlood_G(String blood_G) {
        this.blood_G = blood_G;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "P_name='" + P_name + '\'' +
                ", P_id='" + P_id + '\'' +
                ", P_DOB='" + P_DOB + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", P_email='" + P_email + '\'' +
                ", blood_G='" + blood_G + '\'' +
                '}';
    }

}
