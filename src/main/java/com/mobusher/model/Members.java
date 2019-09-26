package com.mobusher.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Members", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
            }),
            @UniqueConstraint(columnNames = {
                "email"
            })
    })
public class Members {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "Username")
	private String username;

	@Column(name = "Password")
	private String password;

	@Column(name = "Firstname")
	private String fname;

	@Column(name = "Lastname")
	private String lname;

	@Column(name = "Phoneno")
	private Long phoneno;

	@Column(name = "Email")
	@Email @NaturalId
	private String email;

	// MM or BB or ADMIN
	@Column(name = "Type")
	private String type;

	@Column(name = "Store")
	private String store;

	

	// @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, optional =
	// false)
//	@JoinColumn(name = "sId", nullable = true)
//	//@JsonBackReference
//	@JsonIgnore
//	private Store stores;
//	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "member_roles", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "rId"))
	private Set<Role> roles = new HashSet<>();

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	} 

	public Members() {
	}

	public Members(String username,  String fname, String lname, Long phoneno, @Email String email,
			String type, String store, String password) {
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.email = email;
		this.type = type;
		this.store = store;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

//	public Store getStores() {
//		return stores;
//	}
//
//	public void setStores(Store stores) {
//		this.stores = stores;
//	}

}