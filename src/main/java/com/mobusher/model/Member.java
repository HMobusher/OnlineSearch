package com.mobusher.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//Table Name
@Table(name = "User")
public class Member {

	// Auto Incremented Primary Key
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;

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
	// @Size(max=2, message = "Member type should be either MM or BB")
	private String type;

	// Name of the store which you get from the Store Table
	@Column(name = "Workat")
	private String workat;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getWorkat() {
		return workat;
	}

	public void setWorkat(String workat) {
		this.workat = workat;
	}

	

}