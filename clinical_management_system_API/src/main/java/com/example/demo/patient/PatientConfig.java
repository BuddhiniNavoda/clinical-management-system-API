package com.example.demo.patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PatientConfig {

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository repository)
    {
    return args -> {
        Patient Kasun = new Patient(
                "Kasun",
                "26410",
                "1998-09-21",
                "Male",
                "No 123, word street, Gampaha",
                "kasun1234@gmail.com",
                "AB+"
        );
        Patient Alex = new Patient(
                "Alex",
                "26411",
                "1998-03-21",
                "Female",
                "No 123, Totus street, Gampaha",
                "alex1234@gmail.com",
                "B+"
        );
        repository.saveAll(
                List.of(Kasun,Alex)
        );

    };
    }
}


