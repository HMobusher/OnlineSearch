package com.mobusher.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mobusher.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer>{

	Optional<Medicine> findByName(String name);

}
