package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Doctor;

public interface DoctorService {
	Doctor SaveDoctor(Doctor doctor);
	Doctor UpdateDoctor(Doctor doctor);
	void DeleteDoctor(Doctor doctor);
	Optional<Doctor> getDoctorById(int id);
	List<Doctor> getAllDoctors();
	void DeleteDoctorById(int id);

}
