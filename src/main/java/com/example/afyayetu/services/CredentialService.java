package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Credential;

public interface CredentialService {
	Credential SaveCredential(Credential credential);
	Credential UpdateCredential(Credential credential);
	void DeleteCredential(Credential credential);
	Optional<Credential> getCredentialById(int id);
	List<Credential> getAllCredentials();
	void DeleteCredentialById(int id);

}
