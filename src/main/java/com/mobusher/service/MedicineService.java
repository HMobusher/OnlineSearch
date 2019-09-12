package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.dao.MedicineRepo;
import com.mobusher.model.Medicine;


@Service
public class MedicineService {

	@Autowired
	MedicineRepo medRepo;
	
	public List<Medicine> retrieveAllMeds() {
		medRepo.findAll().forEach(System.out::println);
		return (List<Medicine>)medRepo.findAll();
	}

	public Optional<Medicine> getMedById(int mid) {
		return medRepo.findById(mid);
	}

	public void addMed(Medicine med) {
		medRepo.save(med);
	}

	public void deleteMedById(int mid) {
		medRepo.deleteById(mid);
	}
	public void updateMed(Medicine med) {
		medRepo.save(med);
	}
}
