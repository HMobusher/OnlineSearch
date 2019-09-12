package com.mobusher.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobusher.model.Medicine;

public interface MedicineRepo extends CrudRepository<Medicine, Integer>{

}
