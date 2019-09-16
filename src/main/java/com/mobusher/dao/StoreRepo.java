package com.mobusher.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mobusher.model.Medicine;
import com.mobusher.model.Store;

public interface StoreRepo extends CrudRepository<Store, Integer> {

	Optional<Store> findByName(String storename);

}
