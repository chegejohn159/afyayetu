package com.example.afyayetu.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.afyayetu.models.Admin;
import com.example.afyayetu.models.Patient;
import com.example.afyayetu.services.AdminService;
import com.example.afyayetu.services.PatientService;

@RestController
@CrossOrigin
@RequestMapping("/patient")
public class PatientRestController {
	@Autowired
	PatientService patientservice;
	
	
	@GetMapping
	public List<Patient> getPatients(){
		return patientservice.getAllpatients();
	}
	
	@PostMapping
	public Patient createAdmin(@RequestBody Patient patient) {
		return patientservice.Savepatient(patient);
	}
	
	@PutMapping
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientservice.Savepatient(patient);
	}
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable int id) {
		patientservice.DeletePatientById(id);
	}
	@GetMapping("/{id}")
	public Optional<Patient> getOneAdmin(@PathVariable int id) {
		return patientservice.getPatientById(id);
		
	}

}
