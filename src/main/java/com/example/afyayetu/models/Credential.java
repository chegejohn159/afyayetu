package com.example.afyayetu.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Credential {

	@Id
	private Integer id;
	private String username;
	private String email;
	private String password;
	@ManyToMany
	@JoinTable(name="credential_roles", 
	joinColumns=@JoinColumn(name="credential_id"), 
	inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Role> roles;
	@OneToOne(mappedBy = "credential")
	private Doctor doctor;
	@OneToOne(mappedBy = "credential")
	private Patient patient;
	@OneToOne(mappedBy = "credential")
	private Admin admin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credential [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}

}
