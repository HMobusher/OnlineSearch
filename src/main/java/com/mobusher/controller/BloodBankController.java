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
import com.mobusher.model.Medicine;
import com.mobusher.model.Store;
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
	
	@GetMapping("/getBBId/{bId}")
	public Optional<BloodBank> getBBById(@PathVariable Integer bId) {
		return bbService.getBBById(bId);
	}
	@GetMapping("/getBBType/{type}")
	public Optional<BloodBank> getBBByType(@PathVariable String type){
		return bbService.getBBByType(type);
	}
	
	@DeleteMapping("/deleteBB/{bId}")
	public void deleteBBById(@PathVariable Integer bId){
		bbService.deleteBBById(bId);
	}
	
	@PutMapping("/updateBB/{id}")
	public void updateBB(@RequestBody BloodBank bb ,@PathVariable Integer bId) {
		bb.setbId(bId); 
		bbService.updateBB(bb);
	}
	@PutMapping("/updateBB")
	public BloodBank update(@RequestBody BloodBank bb) {
		bbService.updateBB(bb);
		return bb;
	}
}