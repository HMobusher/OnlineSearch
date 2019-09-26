package com.mobusher.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bloodbank")
public class BloodBank {
	
	@Id
	@GeneratedValue
	@Column(name = "bId")
	private Integer bId;
	
	//Positive: O, A, B, AB | Negative: O, A, B, AB 
	@Column(name = "Bloodtype")
	private String type;
	
	//Negatvie or Positive Antigen
	@Column(name = "Rhtype")
	private String rhtype;
	
	@Column(name = "Units")
	private Integer units;
	
	@Column(name = "Bloodbankname")
	private String bloodbankname;
	
	
public String getBloodbankname() {
		return bloodbankname;
	}
	public void setBloodbankname(String bloodbankname) {
		this.bloodbankname = bloodbankname;
	}
	//	@ManyToMany(mappedBy = "bloodbanks")
//	private Set<Store> stores = new HashSet<Store>(); 
//	
	public BloodBank(String type, String rhtype, Integer units, String bloodbankname) {
		this.type = type;
		this.rhtype = rhtype;
		this.units = units;
		this.bloodbankname = bloodbankname;
	}
	public BloodBank() {
	}

//	public Set<Store> getStores() {
//		return stores;
//	}
//
//	public void setStores(Set<Store> stores) {
//		this.stores = stores;
//	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRhtype() {
		return rhtype;
	}

	public void setRhtype(String rhtype) {
		this.rhtype = rhtype;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	
}
