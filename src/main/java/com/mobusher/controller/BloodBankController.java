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

import com.mobusher.model.BloodBank;
import com.mobusher.service.BloodBankService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class BloodBankController {

	@Autowired
	BloodBankService bbService;
	
	@GetMapping("/getAllBB")
	public List<BloodBank> getAllBB(){
		return bbService.retrieveAllBB();
	}
	
	@PostMapping("/addBB")
	public void addBB(@RequestBody BloodBank bb) {
		bbService.addBB(bb);
	}
	
	@GetMapping("/getBB/{id}")
	public Optional<BloodBank> getBBById(@PathVariable int id) {
		return bbService.getBBById(id);
	}
	
	@DeleteMapping("/deleteBB/{id}")
	public void deleteBBById(@PathVariable int id){
		bbService.deleteBBById(id);
	}
	
	@PutMapping("/updateBB/{id}")
	public void updateBB(@RequestBody BloodBank bb ,@PathVariable int id) {
		bb.setId(id); 
		bbService.updateBB(bb);
	}
}