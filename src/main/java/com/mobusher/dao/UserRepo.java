package com.mobusher.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobusher.model.Member;


@Repository
public interface UserRepo extends CrudRepository<Member,  Integer> {
	Member findByUsername(String username);

}
