package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Admin;
import com.example.afyayetu.models.Patient;

public interface PatientService {
	Patient Savepatient(Patient patient);
	Patient Updatepatient(Patient patient);
	void Deletepatient(Patient patient);
	Patient getpatientById(int id);
	List<Patient> getAllpatients();
	Optional<Patient> getPatientById(int id);
	void DeletePatientById(int id);
}
