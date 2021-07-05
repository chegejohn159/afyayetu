package com.example.afyayetu.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment {
	@Id
	private Integer id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient patient;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "availability_id", referencedColumnName = "id")
	private Availability availability;
	
	

}
