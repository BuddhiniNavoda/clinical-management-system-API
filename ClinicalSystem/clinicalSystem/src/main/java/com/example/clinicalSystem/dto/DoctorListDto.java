package com.example.clinicalSystem.dto;

public class DoctorListDto {
    private Long d_id;
    private String d_name;
    private String specialization;
    private Long accessId;

    public DoctorListDto(Long d_id, String d_name, String specialization) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.specialization = specialization;
        this.accessId = accessId;
    }

    public Long getD_id() { return d_id; }
    public void setD_id(Long d_id) { this.d_id = d_id; }

    public String getD_name() { return d_name; }
    public void setD_name(String d_name) { this.d_name = d_name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public Long getAccessId() { return accessId; }
    public void setAccessId(Long accessId) { this.accessId = accessId; }
}
