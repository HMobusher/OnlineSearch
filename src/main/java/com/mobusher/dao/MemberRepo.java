package com.mobusher.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobusher.model.Members;


@Repository
public interface MemberRepo extends CrudRepository<Members,  Integer> {
	Members findByUsername(String username);

}
