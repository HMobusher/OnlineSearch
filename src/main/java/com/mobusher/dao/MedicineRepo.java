package com.mobusher.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mobusher.model.Medicine;

public interface MedicineRepo extends CrudRepository<Medicine, Integer>{

	Optional<Medicine> findByName(String name);

}
