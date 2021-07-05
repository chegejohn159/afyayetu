package com.example.afyayetu.services;
import java.util.List;
import java.util.Optional;

import com.example.afyayetu.models.Admin;


public interface AdminService {
	Admin SaveAdmin(Admin admin);
	Admin UpdateAdmin(Admin admin);
	void DeleteAdmin(Admin admin);
	Optional<Admin> getAdminById(int id);
	List<Admin> getAllAdmins();
	void DeleteAdminById(int id);

}
