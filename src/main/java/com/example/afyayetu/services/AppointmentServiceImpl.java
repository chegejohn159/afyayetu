package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.afyayetu.models.Appointment;
import com.example.afyayetu.repos.AppointmentRepo;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepo appointmentrepo;

	@Override
	public Appointment SaveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentrepo.save(appointment);
	}

	@Override
	public Appointment UpdateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentrepo.save(appointment);
	}

	@Override
	public void DeleteAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentrepo.delete(appointment);
	}
	
	@Override
	public Appointment getappointmentById(int id) {
		// TODO Auto-generated method stub
		return appointmentrepo.findById(id).get();
	}

	@Override
	public Optional<Appointment> getAppointmentById(int id) {
		// TODO Auto-generated method stub
		return appointmentrepo.findById(id);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointmentrepo.findAll();
	}


	@Override
	public void DeleteAppointmentById(int id) {
		// TODO Auto-generated method stub
		appointmentrepo.deleteById(id);
	}


}
