package com.mobusher.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobusher.model.Members;


@Repository
public interface MemberRepo extends CrudRepository<Members,  Long> {
	//Members findByUsername(String username);
	Optional<Members> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
	Optional<Members> findById(int id);
	void deleteById(int id);

}
