package com.mobusher.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mobusher.model.BloodBank;
import com.mobusher.model.Medicine;

public interface BloodBankRepo extends CrudRepository<BloodBank, Integer> {

	Optional<BloodBank> findByType(String type);

}
