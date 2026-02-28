package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Entity.Access;
import com.example.clinicalSystem.Entity.Appointment;
import com.example.clinicalSystem.Entity.Doctor;
import com.example.clinicalSystem.Repository.AccessRepository;
import com.example.clinicalSystem.Repository.AppointmentRepository;
import com.example.clinicalSystem.Repository.DoctorRepository;
import com.example.clinicalSystem.Service.AppoinmentService;
import com.example.clinicalSystem.dto.AppointmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "http://localhost:3000")
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private AccessRepository accessRepository;

    @Autowired
    private final AppoinmentService appoinmentService;

    public AppointmentController(AppoinmentService appoinmentService) {
        this.appoinmentService = appoinmentService;
    }

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping("/book")
    public ResponseEntity<?> book(@RequestBody AppointmentDto appointmentDto) {
      if(appointmentDto.getDoctorId() == null){
          return ResponseEntity.badRequest().body("Doctor not selected");
      }

      if(appointmentDto.getPatientEmail() == null){
          return ResponseEntity.badRequest().body("Patient Email not found");
      }

      if (appointmentDto.getAppointmentDate() == null || appointmentDto.getAppointmentTime() == null){
          return ResponseEntity.badRequest().body("date and time are required");
      }

        Doctor doctor = doctorRepository.findById(appointmentDto.getDoctorId())
                .orElseThrow(()-> new RuntimeException("Doctor not found"));

      if( doctor.getAccess() == null || doctor.getAccess().getId() == null){
          return ResponseEntity.badRequest().body("Doctor  access Id missing ");
      }

        Access patientAccess = accessRepository.findByEmail(appointmentDto.getPatientEmail().trim())
                .orElseThrow(()-> new RuntimeException("Patient email not found"));

      Appointment appointment = new Appointment();
      appointment.setAppointmentDate(appointmentDto.getAppointmentDate());
      appointment.setAppointmentTime(appointmentDto.getAppointmentTime());

      appointment.setPatientEmail(appointmentDto.getPatientEmail().trim());

      appointment.setPatientAccess(patientAccess);
      appointment.setDoctorAccess(doctor.getAccess());

      appointmentRepository.save(appointment);

      return ResponseEntity.ok("Appoinment booked Successfully");
    }
}