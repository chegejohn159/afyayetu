package com.example.afyayetu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.afyayetu.models.Admin;
import com.example.afyayetu.repos.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepo adminrepo;

	@Override
	public Admin SaveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminrepo.save(admin);
	}

	@Override
	public Admin UpdateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminrepo.save(admin);
	}

	@Override
	public void DeleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminrepo.delete(admin);
		

	}
	
	@Override
	public void DeleteAdminById(int id) {
		// TODO Auto-generated method stub
		adminrepo.deleteById(id);
		

	}

	@Override
	public Optional<Admin> getAdminById(int id) {
		// TODO Auto-generated method stub
		return adminrepo.findById(id);
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminrepo.findAll();
	}

	public AdminRepo getAdminrepo() {
		return adminrepo;
	}

	public void setAdminrepo(AdminRepo adminrepo) {
		this.adminrepo = adminrepo;
	}

}
