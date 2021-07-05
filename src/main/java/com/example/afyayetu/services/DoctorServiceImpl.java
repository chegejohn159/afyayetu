package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.afyayetu.models.Doctor;
import com.example.afyayetu.repos.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepo doctorrepo;

	@Override
	public Doctor SaveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorrepo.save(doctor);
	}

	@Override
	public Doctor UpdateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorrepo.save(doctor);
	}

	@Override
	public void DeleteDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorrepo.delete(doctor);

	}

	@Override
	public Optional<Doctor> getDoctorById(int id) {
		// TODO Auto-generated method stub
		return doctorrepo.findById(id);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorrepo.findAll();
	}

	@Override
	public void DeleteDoctorById(int id) {
		// TODO Auto-generated method stub
		doctorrepo.deleteById(id);
		
	}

}
