package com.mobusher.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobusher.model.Address;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
