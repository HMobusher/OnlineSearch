package com.mobusher.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BloodBank")
public class BloodBank {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	//Positive: O, A, B, AB | Negative: O, A, B, AB 
	@Column(name = "Bloodtype")
	private String type;
	
	//Negatvie or Positive Antigen
	@Column(name = "Rhtype")
	private String rhtype;
	
	@Column(name = "Units")
	private int units;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	


	
	
	
	
	
}
