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
	
	@GetMapping("/getMedId/{mId}")
	public Optional<Medicine> getMedById(@PathVariable Integer mId) {
		return medService.getMedById(mId);
	}
	@GetMapping("/getMedName/{name}")
	public Optional<Medicine> getMedByName(@PathVariable String name){
		return medService.getMedByName(name);
	}
	
	@DeleteMapping("/deleteMed/{mId}")
	public void deleteMedById(@PathVariable Integer mId){
		medService.deleteMedById(mId);
	}
	
	@PutMapping("/updateMed/{mId}")
	public void updateMed(@RequestBody Medicine med ,@PathVariable Integer mId) {
		med.setmId(mId); 
		medService.updateMed(med);
	}
	@PutMapping("/updateMed")
	public Medicine update(@RequestBody Medicine med) {
		medService.updateMed(med);
		return med;
	}
	
}