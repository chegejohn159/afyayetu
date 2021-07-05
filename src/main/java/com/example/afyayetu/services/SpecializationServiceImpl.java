package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.afyayetu.models.Specialization;
import com.example.afyayetu.repos.SpecializationRepo;

@Service
public class SpecializationServiceImpl implements SpecializationService {
	@Autowired
	SpecializationRepo specializationrepo;

	@Override
	public Specialization SaveSpecialization(Specialization specialization) {
		// TODO Auto-generated method stub
		return specializationrepo.save(specialization);
	}

	@Override
	public Specialization UpdateSpecialization(Specialization specialization) {
		// TODO Auto-generated method stub
		return specializationrepo.save(specialization);
	}

	@Override
	public void Deletespecialization(Specialization specialization) {
		// TODO Auto-generated method stub
		specializationrepo.delete(specialization);
	}

	@Override
	public Optional<Specialization> getSpecializationById(int id) {
		// TODO Auto-generated method stub
		return specializationrepo.findById(id);
	}

	@Override
	public List<Specialization> getAllSpecializations() {
		// TODO Auto-generated method stub
		return specializationrepo.findAll();
	}


	@Override
	public void DeletespecializationById(int id) {
		// TODO Auto-generated method stub
		specializationrepo.deleteById(id);
	}

}
