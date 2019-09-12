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

import com.mobusher.model.Address;
import com.mobusher.service.AddressService;


@RestController
@RequestMapping(path="/")
public class AddressController {

	@Autowired
	AddressService addService;
	
	@GetMapping("/getAllAddresses")
	public List<Address> getAllAddresses(){
		return addService.retrieveAllAddresses();
	}
	
	@PostMapping("/addAddress")
	public void addAddress(@RequestBody Address add) {
		addService.addAddress(add);
	}
	
	@GetMapping("/getAddress/{addid}")
	public Optional<Address> getAddressById(@PathVariable int addid) {
		return addService.getAddressById(addid);
	}
	
	@DeleteMapping("/deleteAddress/{addid}")
	public void deleteAddressById(@PathVariable int addid){
		addService.deleteAddressById(addid);
	}
	
	@PutMapping("/updateAddress/{addid}")
	public void updateAddress(@RequestBody Address add ,@PathVariable int addid) {
		add.setAddid(addid); 
		addService.updateAddress(add);
	}
}
