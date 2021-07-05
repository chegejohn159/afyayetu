package com.example.afyayetu.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.afyayetu.models.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

}
