package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.dao.AddressRepo;
import com.mobusher.model.Address;

@Service
public class AddressService {
	
	@Autowired
	AddressRepo addressRepo;
	
	public List<Address> retrieveAllAddresses() {
		addressRepo.findAll().forEach(System.out::println);
		return (List<Address>)addressRepo.findAll();
	}

	public Optional<Address> getAddressById(int id) {
		return addressRepo.findById(id);
	}

	public void addAddress(Address add) {
		addressRepo.save(add);
	}

	public void deleteAddressById(int id) {
		addressRepo.deleteById(id);
	}
	public void updateAddress(Address add) {
		addressRepo.save(add);
	}
}
