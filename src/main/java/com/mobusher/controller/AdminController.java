package com.mobusher.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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


@RestController
@RequestMapping(path="/")
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
	
	@GetMapping("/getAdmin/{adminid}")
	public Optional<Admin> getAdminById(@PathVariable int adminid) {
		return adminService.getAdminById(adminid);
	}
	
	@DeleteMapping("/deleteAdmin/{adminid}")
	public void deleteAdminById(@PathVariable int adminid){
		adminService.deleteAdminById(adminid);
	}
	
	@PutMapping("/updateAdmin/{adminid}")
	public void updateAdmin(@RequestBody Admin admin ,@PathVariable int adminid) {
		admin.setAdminid(adminid); 
		adminService.updateAdmin(admin);
	}

}
