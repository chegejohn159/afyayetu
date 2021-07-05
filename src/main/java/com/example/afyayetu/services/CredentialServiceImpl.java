package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.afyayetu.models.Credential;
import com.example.afyayetu.repos.CredentialRepo;

@Service
public class CredentialServiceImpl implements CredentialService {
	@Autowired
	CredentialRepo credentialrepo;

	@Override
	public Credential SaveCredential(Credential credential) {
		// TODO Auto-generated method stub
		return credentialrepo.save(credential);
	}

	@Override
	public Credential UpdateCredential(Credential credential) {
		// TODO Auto-generated method stub
		return credentialrepo.save(credential);
	}

	@Override
	public void DeleteCredential(Credential credential) {
		// TODO Auto-generated method stub
		credentialrepo.delete(credential);

	}

	@Override
	public Optional<Credential> getCredentialById(int id) {
		// TODO Auto-generated method stub
		return credentialrepo.findById(id);
	}

	@Override
	public List<Credential> getAllCredentials() {
		// TODO Auto-generated method stub
		return credentialrepo.findAll();
	}

	@Override
	public void DeleteCredentialById(int id) {
		// TODO Auto-generated method stub
		credentialrepo.deleteById(id);
	}

}
