package com.example.afyayetu.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.afyayetu.models.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
