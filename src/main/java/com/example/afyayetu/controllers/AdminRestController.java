package com.example.afyayetu.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.afyayetu.models.Admin;
import com.example.afyayetu.repos.AdminRepo;
import com.example.afyayetu.services.AdminService;

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

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminRestController {
	
	@Autowired
	AdminService adminservice;
	
	
	@GetMapping
	public List<Admin> getAdmins(){
		return adminservice.getAllAdmins();
	}
	
	@PostMapping
	public Admin createAdmin(@RequestBody Admin admin) {
		return adminservice.SaveAdmin(admin);
	}
	
	@PutMapping
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminservice.SaveAdmin(admin);
	}
	@DeleteMapping("/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminservice.DeleteAdminById(id);
	}
	@GetMapping("/{id}")
	public Optional<Admin> getOneAdmin(@PathVariable int id) {
		return adminservice.getAdminById(id);
		
	}
}
