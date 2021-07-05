package com.example.afyayetu.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.afyayetu.models.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
