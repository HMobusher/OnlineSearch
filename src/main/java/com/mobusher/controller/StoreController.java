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

import com.mobusher.model.Store;
import com.mobusher.service.StoreService;



@RestController
@RequestMapping(path="/")
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
	
	@GetMapping("/getStore/{storeid}")
	public Optional<Store> getStoreById(@PathVariable int storeid) {
		return storeService.getStoreById(storeid);
	}
	
	@DeleteMapping("/deleteStore/{storeid}")
	public void deleteStoreById(@PathVariable int storeid){
		storeService.deleteStoreById(storeid);
	}
	
	@PutMapping("/updateStore/{storeid}")
	public void updateStore(@RequestBody Store store ,@PathVariable int storeid) {
		store.setStoreid(storeid); 
		storeService.updateStore(store);
	}
	
}
