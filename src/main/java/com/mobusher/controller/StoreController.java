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

import com.mobusher.model.Store;
import com.mobusher.service.StoreService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class StoreController {

	@Autowired
	StoreService storeService;
	
	@GetMapping("/getAllStores")
	public List<Store> getAllStores(){
		return storeService.retrieveAllStores();
	}
	
	@PostMapping("/addStore")
	public void addStore(@RequestBody Store store) {
		storeService.addStore(store);
	}
	
	@GetMapping("/getStoreId/{id}")
	public Optional<Store> getStoreById(@PathVariable int id) {
		return storeService.getStoreById(id);
	}
	@GetMapping("/getStoreName/{storename}")
	public Optional<Store> getStoreByName(@PathVariable String storename) {
		return storeService.getStoreByName(storename);
	}
	
	@DeleteMapping("/deleteStore/{id}")
	public void deleteStoreById(@PathVariable int id){
		storeService.deleteStoreById(id);
	}
	
	@PutMapping("/updateStore/{id}")
	public void updateStore(@RequestBody Store store ,@PathVariable int id) {
		store.setId(id); 
		storeService.updateStore(store);
	}
	
}
