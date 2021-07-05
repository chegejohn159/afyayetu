package com.example.afyayetu.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Doctor {
	@Id
	private Integer id;
	private String first_name;
	private String second_name;
	private String last_name;
	private String gender;
	private Integer specialization_id;
	private Date dob;
	private String phone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "credential_id", referencedColumnName = "id")
	private Credential credential;
	@OneToMany(mappedBy = "doctor", cascade = { CascadeType.ALL})
	private List<Availability> availabilities;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "specialization_id",
	insertable = false, updatable = false,
	referencedColumnName = "id")
	private Specialization specialization;

//	private Integer Credential;
//	private Integer Specialization;
	public Integer getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getGender() {
		return gender;
	}

	public Date getDob() {
		return dob;
	}

	public String getPhone() {
		return phone;
	}
	public Integer getSpecializationId() {
		return specialization_id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public void setSpecializationId(Integer specialization_id) {
		this.specialization_id = specialization_id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
