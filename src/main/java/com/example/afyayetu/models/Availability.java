package com.example.afyayetu.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.Date;

@Entity
public class Availability {
	@Id
	private Integer id;
	private Date date;
	private String time;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	@OneToOne(mappedBy = "availability")
	private Appointment appointment;
	

}
