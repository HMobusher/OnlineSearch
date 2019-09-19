package com.mobusher.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Members")
public class Members {

	// Auto Incremented Primary Key
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "Username")
	private String username;
	
	@Column(name = "Password")
	private String password;

	@Column(name = "Firstname")
	private String fname;

	@Column(name = "Lastname")
	private String lname;

	@Column(name = "Phoneno")
	private long phoneno;

	@Column(name = "Email")
	// @NotNull(message="Email cannot be null!!")
	private String email;

	// MedicalMember or BloodBankMember
	@Column(name = "Type")
	private String type;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "sId", nullable = false)
	private Store stores;
	
	public Members() {
		
	}

	public Members(String username, String password, String fname, String lname, long phoneno, String email,
			String type) {
		super();
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.email = email;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
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

	public Store getStores() {
		return stores;
	}

	public void setStores(Store stores) {
		this.stores = stores;
	}


	

}