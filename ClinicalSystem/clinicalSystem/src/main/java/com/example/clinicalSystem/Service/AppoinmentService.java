package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Entity.Appointment;
import com.example.clinicalSystem.Entity.Doctor;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.Repository.AppointmentRepository;
import com.example.clinicalSystem.Repository.DoctorRepository;
import com.example.clinicalSystem.Repository.PatientRepository;
import com.example.clinicalSystem.dto.AppointmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppoinmentService {
    @Autowired
    private final  AppointmentRepository appointmentRepository;

    private final AccessRepository accessRepository;

    private final DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    public AppoinmentService(AppointmentRepository appointmentRepository, AccessRepository accessRepository, DoctorRepository doctorRepository) {
        this.appointmentRepository = appointmentRepository;
        this.accessRepository = accessRepository;
        this.doctorRepository = doctorRepository;
    }

    public Appointment book(AppointmentDto appointmentDto){

        Access doctorAccess = accessRepository.findById(appointmentDto.getDoctorId())
                .orElseThrow(()-> new RuntimeException("Doctor access not find"));

        if (!"Doctor".equalsIgnoreCase(doctorAccess.getUserType())) {
            throw new RuntimeException("Only Doctor can book from this endpoint");
        }

        //2) find doctor by doctorId (from UI)
        Doctor doctor = doctorRepository.findById(appointmentDto.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor record not found"));

        if(doctor.getAccess() == null  || ! doctor.getAccess().getId().equals(doctorAccess.getId())){
            throw  new RuntimeException("Doctor mismatch (you cant book for another doctor)");
        }

        Access patientAccess = accessRepository.findByEmail(appointmentDto.getPatientEmail())
                .orElseThrow(()-> new RuntimeException("Patient email not found"));

        if(! "Patient ".equalsIgnoreCase(patientAccess.getUserType())){
            throw new RuntimeException("This email is not a Patient");
        }

        Appointment appointment = new Appointment();
        appointment.setPatientAccess(patientAccess);
        appointment.getDoctorAccess(doctorAccess);
        appointment.setAppointmentTime(appointmentDto.getAppointmentTime());
        appointment.setAppointmentDate(appointmentDto.getAppointmentDate());

    return appointmentRepository.save(appointment);
    }
}
