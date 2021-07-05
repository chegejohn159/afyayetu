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

import com.example.afyayetu.models.Specialization;
import com.example.afyayetu.services.SpecializationService;

@RestController
@CrossOrigin
@RequestMapping("/specialization")
public class SpecializationRestController {
	@Autowired
	SpecializationService specializationservice;
	@GetMapping
	public List<Specialization> getSpecialization(){
		return specializationservice.getAllSpecializations();
	}
	
	@PostMapping
	public Specialization createSpecialization(@RequestBody Specialization specialization) {
		return specializationservice.SaveSpecialization(specialization);
	}
	
	@PutMapping
	public Specialization updateSpecialization(@RequestBody Specialization specialization) {
		return specializationservice.SaveSpecialization(specialization);
	}
	@DeleteMapping("/{id}")
	public void deleteSpecialization(@PathVariable int id) {
		specializationservice.DeletespecializationById(id);
	}
	@GetMapping("/{id}")
	public Optional<Specialization> getOneCredential(@PathVariable int id) {
		return specializationservice.getSpecializationById(id);
		
	}
	

}
