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
	private Integer id;
	
	//Positive: O, A, B, AB | Negative: O, A, B, AB 
	@Column(name = "Bloodtype")
	private String type;
	
	//Negatvie or Positive Antigen
	@Column(name = "Rhtype")
	private String rhtype;
	
	@Column(name = "Units")
	private Integer units;
	
	@ManyToMany(mappedBy = "bloodbanks")
	private Set<Store> stores = new HashSet<Store>(); 
	
	public BloodBank(String type, String rhtype, Integer units) {
		this.type = type;
		this.rhtype = rhtype;
		this.units = units;
	}

	public Set<Store> getStores() {
		return stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
