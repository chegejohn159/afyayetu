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
import com.example.afyayetu.models.Doctor;
import com.example.afyayetu.services.DoctorService;

@RestController
@CrossOrigin
@RequestMapping("/doctor")
public class DoctorRestController {
	
	@Autowired
	DoctorService doctorservice; 
	
	@GetMapping
	public List<Doctor> getDoctors(){
		return doctorservice.getAllDoctors();
	}
	
	@PostMapping
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorservice.SaveDoctor(doctor);
	}
	
	@PutMapping
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorservice.SaveDoctor(doctor);
	}
	@DeleteMapping("/{id}")
	public void deleteDoctor(@PathVariable int id) {
		doctorservice.DeleteDoctorById(id);
	}
	@GetMapping("/{id}")
	public Optional<Doctor> getOneDoctor(@PathVariable int id) {
		return doctorservice.getDoctorById(id);
		
	}

}
