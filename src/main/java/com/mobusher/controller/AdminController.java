package com.mobusher.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobusher.model.Admin;
import com.mobusher.service.AdminService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/getAllAdmins")
	public List<Admin> getAllAdmins(){
		return adminService.retrieveAllAdmins();
	}
	
	@PostMapping("/addAdmin")
	public void addAdmin(@RequestBody Admin admin) {
		adminService.addAdmin(admin);
	}
	
	@GetMapping("/getAdmin/{id}")
	public Optional<Admin> getAdminById(@PathVariable int id) {
		return adminService.getAdminById(id);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdminById(@PathVariable int id){
		adminService.deleteAdminById(id);
	}
	
	@PutMapping("/updateAdmin/{id}")
	public void updateAdmin(@RequestBody Admin admin ,@PathVariable int id) {
		admin.setId(id); 
		adminService.updateAdmin(admin);
	}

}
