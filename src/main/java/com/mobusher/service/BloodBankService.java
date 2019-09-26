package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.model.BloodBank;
import com.mobusher.model.Medicine;
import com.mobusher.repo.BloodBankRepo;


@Service
public class BloodBankService {

	@Autowired
	BloodBankRepo bbRepo;
	
	public List<BloodBank> retrieveAllBB() {
		bbRepo.findAll().forEach(System.out::println);
		return (List<BloodBank>)bbRepo.findAll();
	}

	public Optional<BloodBank> getBBById(int id) {
		return bbRepo.findById(id);
	}
	
	public Optional<BloodBank> getBBByType(String type){
		return bbRepo.findByType(type);
	}

	public void addBB(BloodBank bb) {
		bbRepo.save(bb);
	}
	
	public void deleteBBById(int id) {
		bbRepo.deleteById(id);
	}
	public void updateBB(BloodBank bb) {
		bbRepo.save(bb);
	}
	
}
