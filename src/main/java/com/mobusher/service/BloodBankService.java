package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.dao.BloodBankRepo;
import com.mobusher.model.BloodBank;


@Service
public class BloodBankService {

	@Autowired
	BloodBankRepo bbRepo;
	
	public List<BloodBank> retrieveAllBB() {
		bbRepo.findAll().forEach(System.out::println);
		return (List<BloodBank>)bbRepo.findAll();
	}

	public Optional<BloodBank> getBBById(int bbid) {
		return bbRepo.findById(bbid);
	}

	public void addBB(BloodBank bb) {
		bbRepo.save(bb);
	}

	public void deleteBBById(int bbid) {
		bbRepo.deleteById(bbid);
	}
	public void updateBB(BloodBank bb) {
		bbRepo.save(bb);
	}
}
