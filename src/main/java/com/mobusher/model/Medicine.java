package com.mobusher.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Medicine")
public class Medicine {

	@Id
	@GeneratedValue
	@Column(name = "mId")
	private Integer mId;

	@Column(name = "Name")
	private String name;

	// Prescribed or Over the counter as PR or OTC
	@Column(name = "Type")
	private String type;

	@Column(name = "Stock")
	private Integer stock;
	
	@ManyToMany(mappedBy = "medicines")
	private Set<Store> stores = new HashSet<Store>(); 
	
	
	public Set<Store> getStores() {
		return stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}

	
	public Medicine(String name, String type, Integer stock) {
		this.name = name;
		this.type = type;
		this.stock = stock;
	}

	public Medicine() {
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	

}
