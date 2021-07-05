package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Specialization;

public interface SpecializationService {
	Specialization SaveSpecialization(Specialization specialization);
	Specialization UpdateSpecialization(Specialization specialization);
	void Deletespecialization(Specialization specialization);
	Optional<Specialization> getSpecializationById(int id);
	List<Specialization> getAllSpecializations();
	void DeletespecializationById(int id);
}
