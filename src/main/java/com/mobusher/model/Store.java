package com.mobusher.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Store")
public class Store {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;

	@Column(name = "Name")
	private String storename;

	// Either Medical or Blood Bank
	@Column(name = "Type")
	private String type;

	// Either WholeSale or Retail Sales
	// WS= WholeSale | RS= Retail Sales
	@Column(name = "Salestype")
	private String salestype;

	// If Available for 24 hours
	@Column(name = "Open24")
	private String storeopen24;

	// Medicine Delivery
	@Column(name = "Delivery")
	private String storedelivery;
	
	@OneToOne(mappedBy="store", cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;
	
	public Store() {
	}

	public Store(String storename, String type, String salestype, String storeopen24, String storedelivery) {
		this.storename = storename;
		this.type = type;
		this.salestype = salestype;
		this.storeopen24 = storeopen24;
		this.storedelivery = storedelivery;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSalestype() {
		return salestype;
	}

	public void setSalestype(String salestype) {
		this.salestype = salestype;
	}

	public String getStoreopen24() {
		return storeopen24;
	}

	public void setStoreopen24(String storeopen24) {
		this.storeopen24 = storeopen24;
	}

	public String getStoredelivery() {
		return storedelivery;
	}

	public void setStoredelivery(String storedelivery) {
		this.storedelivery = storedelivery;
	}

	
	
}
