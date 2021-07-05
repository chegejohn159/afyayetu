package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Availability;


public interface AvailabilityService {
	Availability SaveAvailability(Availability availability);
	Availability UpdateAvailability(Availability availability);
	void DeleteAvailability(Availability availability);
	Optional<Availability> getAvailabilityById(int id);
	List<Availability> getAllAvailabilitys();
	void DeleteAvailabilityById(int id);
}
