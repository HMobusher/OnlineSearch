package com.mobusher.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
//POJO
@Entity
@Table(name = "Address")
public class Address {

	@Id
	@Column(name = "Id")
	private int id;

	// Store/BloodBank name
	@Column(name = "Name")
	private String name;

	// Building number and street
	@Column(name = "Street")
	private String street;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	// 5 digit zipcode
	@Column(name = "Zipcode")
	private String zipcode;

	@Column(name = "Country")
	private String country;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Store store;
	
	public Address() {	
	}
	
	public Address(String name, String street, String city, String state, String zipcode, String country) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}
	//Getters and Setters
	
	//Store One to One
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	//Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Street
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	//City
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//State
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	//Zipcode
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	//Country
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [ " + street + ", " + city + ", " + state + " " + zipcode + ", " + country + " ]";
	}

}
