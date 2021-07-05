package com.example.afyayetu.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	private Integer id;
	private String name;
	@ManyToMany(mappedBy="roles")
	private List<Credential> credential;	

}
