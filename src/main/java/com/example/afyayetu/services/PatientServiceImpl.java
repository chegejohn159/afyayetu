package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.afyayetu.models.Admin;
import com.example.afyayetu.models.Patient;
import com.example.afyayetu.repos.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepo patientrepo;

	@Override
	public Patient Savepatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientrepo.save(patient);
	}

	@Override
	public Patient Updatepatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientrepo.save(patient);
	}

	@Override
	public void Deletepatient(Patient patient) {
		// TODO Auto-generated method stub
		patientrepo.delete(patient);
	}

	@Override
	public Patient getpatientById(int id) {
		// TODO Auto-generated method stub
		return patientrepo.findById(id).get();
	}

	@Override
	public List<Patient> getAllpatients() {
		// TODO Auto-generated method stub
		return patientrepo.findAll();
	}

	@Override
	public Optional<Patient> getPatientById(int id) {
		// TODO Auto-generated method stub
		return patientrepo.findById(id);
	}

	@Override
	public void DeletePatientById(int id) {
		// TODO Auto-generated method stub
		patientrepo.deleteById(id);
	}

}
