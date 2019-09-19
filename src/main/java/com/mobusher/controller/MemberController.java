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

import com.mobusher.model.Members;
import com.mobusher.service.MemberService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class MemberController {

	@Autowired
	MemberService userService;
	
	@GetMapping("/getAllMembers")
	public List<Members> getAllMembers(){
		return userService.retrieveAllMembers();
	}
	
	@PostMapping("/addMember")
	public void addMember(@RequestBody Members user) {
		userService.addMember(user);
	}
	
	@GetMapping("/getMember/{id}")
	public Optional<Members> getMemberById(@PathVariable Integer id) {
		return userService.getMemberById(id);
	}
	
	@DeleteMapping("/deleteMember/{id}")
	public void deleteMemberById(@PathVariable Integer id){
		userService.deleteMemberById(id);
	}
	
	@PutMapping("/updateMember/{id}")
	public void updateMember(@RequestBody Members user ,@PathVariable Integer id) {
		user.setId(id); 
		userService.updateMember(user);
	}
}
	