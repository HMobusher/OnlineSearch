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

import com.mobusher.model.Medicine;
import com.mobusher.service.MedicineService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class MedicineController {

	@Autowired
	MedicineService medService;
	
	@GetMapping("/getAllMeds")
	public List<Medicine> getAllMeds(){
		return medService.retrieveAllMeds();
	}
	
	@PostMapping("/addMed")
	public void addMed(@RequestBody Medicine med) {
		medService.addMed(med);
	}
	
	@GetMapping("/getMed{mid}")
	public Optional<Medicine> getMedById(@PathVariable int mid) {
		return medService.getMedById(mid);
	}
	
	@DeleteMapping("/deleteMed/{mid}")
	public void deleteMedById(@PathVariable int mid){
		medService.deleteMedById(mid);
	}
	
	@PutMapping("/updateMed/{mid}")
	public void updateMed(@RequestBody Medicine med ,@PathVariable int mid) {
		med.setId(mid); 
		medService.updateMed(med);
	}
}