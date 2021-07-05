package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Appointment;


public interface AppointmentService {
	Appointment SaveAppointment(Appointment appointment);
	Appointment UpdateAppointment(Appointment appointment);
	void DeleteAppointment(Appointment appointment);
	Optional<Appointment> getAppointmentById(int id);
	List<Appointment> getAllAppointments();
	void DeleteAppointmentById(int id);
	Appointment getappointmentById(int id);
}
