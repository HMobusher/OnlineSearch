package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.dao.StoreRepo;
import com.mobusher.model.Medicine;
import com.mobusher.model.Store;

@Service
public class StoreService {
	
	@Autowired
	StoreRepo storeRepo;

	public List<Store> retrieveAllStores() {
		storeRepo.findAll().forEach(System.out::println);
		return (List<Store>)storeRepo.findAll();
	}

	public Optional<Store> getStoreById(int id) {
		return storeRepo.findById(id);
	}
	public Optional<Store> getStoreByName(String storename){
		return storeRepo.findByName(storename);
	}

	public void addStore(Store store) {
		storeRepo.save(store);
	}

	public void deleteStoreById(int id) {
		storeRepo.deleteById(id);
	}
	public void updateStore(Store store) {
		storeRepo.save(store);
	}

}
