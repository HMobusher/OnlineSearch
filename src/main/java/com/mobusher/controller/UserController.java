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

import com.mobusher.model.Member;
import com.mobusher.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<Member> getAllUsers(){
		return userService.retrieveAllUsers();
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody Member user) {
		userService.addUser(user);
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<Member> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
//	@GetMapping("/user/{username}")
//	public Optional<Member> getUserByUsername(@PathVariable String username) {
//		return userService.getUserByUsername(username);
//	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUserById(@PathVariable int id){
		userService.deleteUserById(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public void updateUser(@RequestBody Member user ,@PathVariable int id) {
		user.setId(id); 
		userService.updateUser(user);
	}
}
	