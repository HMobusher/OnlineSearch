package com.mobusher.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mobusher.model.Members;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MemberPrinciple implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String fname;

	private String lname;

	private String username;

	@JsonIgnore
	private String password;

	private Long phoneno;

	private String email;

	private String type;
	
	private String store;

	private Collection<? extends GrantedAuthority> authorities;

	public MemberPrinciple(Long id, String fname, String lname, String username, String email, String password,
			Long phoneno, String type, String store, Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.type = type;
		this.username = username;
		this.email = email;
		this.password = password;
		this.store = store;
		this.authorities = authorities;
	}

	public static MemberPrinciple build(Members user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());

		return new MemberPrinciple(user.getId(), 
				user.getFname(), 
				user.getLname(), 
				user.getUsername(), 
				user.getEmail(),
				user.getPassword(),
				user.getPhoneno(), 
				user.getType(),
				user.getStore(), 
				authorities
				);
	}

	public Long getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public String getEmail() {
		return email;
	}

	public String getType() {
		return type;
	}

	public String getStore() {
		return store;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())return false;

		MemberPrinciple user = (MemberPrinciple) o;
		return Objects.equals(id, user.id);
	}
}
