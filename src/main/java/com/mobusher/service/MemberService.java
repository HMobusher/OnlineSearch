package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobusher.model.Members;
import com.mobusher.repo.MemberRepo;

@Service
public class MemberService {

	@Autowired
	MemberRepo userRepo;

	public List<Members> retrieveAllMembers() {
		userRepo.findAll().forEach(System.out::println);
		return (List<Members>)userRepo.findAll();
	}

	public Optional<Members> getMemberById(int id) {
		return userRepo.findById(id);
	}
	
	public void addMember(Members user) {
		userRepo.save(user);
	}

	public void deleteMemberById(int id) {
		userRepo.deleteById(id);
	}
	//To update the user
	public void updateMember(Members user) {
		userRepo.save(user);
	}
	
}


