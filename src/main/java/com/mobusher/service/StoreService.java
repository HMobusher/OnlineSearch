package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.model.Medicine;
import com.mobusher.model.Store;
import com.mobusher.repo.StoreRepo;

@Service
public class StoreService {
	
	@Autowired
	StoreRepo storeRepo;

	public List<Store> retrieveAllStores() {
		storeRepo.findAll().forEach(System.out::println);
		return (List<Store>)storeRepo.findAll();
	}

	public Optional<Store> getStoreById(Integer mId) {
		return storeRepo.findById(mId);
	}
	
	public void addStore(Store store) {
		storeRepo.save(store);
	}

	public void deleteStoreById(Integer mId) {
		storeRepo.deleteById(mId);
	}
	public void updateStore(Store store) {
		storeRepo.save(store);
	}

}
