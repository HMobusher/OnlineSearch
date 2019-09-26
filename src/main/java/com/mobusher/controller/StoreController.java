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
import com.mobusher.model.Store;
import com.mobusher.service.StoreService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class StoreController {

	@Autowired
	StoreService storeService;
	
	@GetMapping("/getStores")
	public List<Store> getAllStores(){
		return storeService.retrieveAllStores();
	}
	
	@PostMapping("/addStore")
	public void addStore(@RequestBody Store store) {
		storeService.addStore(store);
	}
	
	@GetMapping("/getStoreId/{sId}")
	public Optional<Store> getStoreById(@PathVariable Integer sId) {
		return storeService.getStoreById(sId);
	}
	
	@DeleteMapping("/deleteStore/{sId}")
	public void deleteStoreById(@PathVariable Integer sId){
		storeService.deleteStoreById(sId);
	}
	
	@PutMapping("/updateStore/{sId}")
	public void updateStore(@RequestBody Store store ,@PathVariable Integer sId) {
		store.setsId(sId); 
		storeService.updateStore(store);
	}
	@PutMapping("/updateStore")
	public Store update(@RequestBody Store store) {
		storeService.updateStore(store);
		return store;
	}
	
}
