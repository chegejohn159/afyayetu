package com.example.afyayetu.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.afyayetu.models.Credential;

public interface CredentialRepo extends JpaRepository<Credential, Integer> {

}
