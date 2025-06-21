package com.example.demo;

import java.util.List;

import com.example.demo.patient.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class ClinicalSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClinicalSystemApplication.class, args);
	}


}
