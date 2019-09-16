package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.mobusher.dao.MemberRepo;
import com.mobusher.model.Member;

@Service
public class MemberService {

	@Autowired
	MemberRepo userRepo;

	public List<Member> retrieveAllUsers() {
		userRepo.findAll().forEach(System.out::println);
		return (List<Member>)userRepo.findAll();
	}

	public Optional<Member> getUserById(int id) {
		return userRepo.findById(id);
	}
//	public Optional<Member> getUserByUsername(String username){
//		return userRepo.findByUsername(username);
//	}

	public void addUser(Member user) {
		userRepo.save(user);
	}

	public void deleteUserById(int id) {
		userRepo.deleteById(id);
	}
	//To update the user
	public void updateUser(Member user) {
		userRepo.save(user);
	}
	
}


