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
import com.example.afyayetu.models.Credential;
import com.example.afyayetu.services.CredentialService;

@RestController
@CrossOrigin
@RequestMapping("/credential")
public class CredentialRestController {
	@Autowired
	CredentialService credentialservice;
	@GetMapping
	public List<Credential> getCredentials(){
		return credentialservice.getAllCredentials();
	}
	
	@PostMapping
	public Credential createCredential(@RequestBody Credential credential) {
		return credentialservice.SaveCredential(credential);
	}
	
	@PutMapping
	public Credential updateCredential(@RequestBody Credential credential) {
		return credentialservice.SaveCredential(credential);
	}
	@DeleteMapping("/{id}")
	public void deleteCredential(@PathVariable int id) {
		credentialservice.DeleteCredentialById(id);
	}
	@GetMapping("/{id}")
	public Optional<Credential> getOneCredential(@PathVariable int id) {
		return credentialservice.getCredentialById(id);
		
	}
	

}
