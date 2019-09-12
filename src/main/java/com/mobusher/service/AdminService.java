package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.dao.AdminRepo;
import com.mobusher.model.Admin;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	
	public List<Admin> retrieveAllAdmins() {
		adminRepo.findAll().forEach(System.out::println);
		return (List<Admin>)adminRepo.findAll();
	}

	public Optional<Admin> getAdminById(int adminid) {
		return adminRepo.findById(adminid);
	}

	public void addAdmin(Admin admin) {
		adminRepo.save(admin);
	}

	public void deleteAdminById(int admin) {
		adminRepo.deleteById(admin);
	}
	public void updateAdmin(Admin admin) {
		adminRepo.save(admin);
	}
}
