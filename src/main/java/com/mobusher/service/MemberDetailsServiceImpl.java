package com.mobusher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobusher.model.Members;
import com.mobusher.repo.MemberRepo;

@Service
public class MemberDetailsServiceImpl implements UserDetailsService {

	@Autowired
	MemberRepo userRepository;

	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Members user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));

		return MemberPrinciple.build(user);
	}
}
