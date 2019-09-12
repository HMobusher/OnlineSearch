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

import com.mobusher.model.BloodBank;
import com.mobusher.service.BloodBankService;


@RestController
@RequestMapping(path="/")
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
	
	@GetMapping("/getBB/{bbid}")
	public Optional<BloodBank> getBBById(@PathVariable int bbid) {
		return bbService.getBBById(bbid);
	}
	
	@DeleteMapping("/deleteBB/{bbid}")
	public void deleteBBById(@PathVariable int bbid){
		bbService.deleteBBById(bbid);
	}
	
	@PutMapping("/updateBB/{bbid}")
	public void updateBB(@RequestBody BloodBank bb ,@PathVariable int bbid) {
		bb.setId(bbid); 
		bbService.updateBB(bb);
	}
}