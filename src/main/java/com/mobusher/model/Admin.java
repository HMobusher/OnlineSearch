package com.mobusher.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue
	@Column(name = "aId")
	private Integer id;

	@Column(name = "Name")
	private String adminname;

	@Column(name = "Username")
	private String adminusername;

	@Column(name = "Password")
	private String adminpassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminusername() {
		return adminusername;
	}

	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public Admin(String adminname, String adminusername, String adminpassword) {
		super();
		this.adminname = adminname;
		this.adminusername = adminusername;
		this.adminpassword = adminpassword;
	}

	
	
}
