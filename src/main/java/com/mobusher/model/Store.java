package com.mobusher.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Store")
public class Store {

	@Id
	@GeneratedValue
	@Column(name = "sId")
	private Integer sId;

	@Column(name = "Name")
	private String storename;

	// Building number and street
	@Column(name = "Street")
	private String street;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	// 5 digit zipcode
	@Column(name = "Zipcode")
	private Integer zipcode;

	@Column(name = "Country")
	private String country;

	// Medical or Blood Bank
	@Column(name = "Type")
	private String type;

	// WS= WholeSale | RS= Retail Sales
	@Column(name = "Salestype")
	private String salestype;

	// If Available for 24 hours
	@Column(name = "Open24")
	private String open24;

	// Medicine Delivery
	@Column(name = "Delivery")
	private String delivery;

	
//	@OneToMany(mappedBy="stores",fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
//	//@JsonManagedReference
//	@JsonIgnore
//	private Set<Members> members = new HashSet<Members>();
//	
//	//ID Relationship to Medicine
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "Store_Medicine",
//	joinColumns = {	@JoinColumn(name = "sId")}, 
//				inverseJoinColumns= {@JoinColumn(name = "mId")})
//	private Set<Medicine> medicines = new HashSet<Medicine>();
//	
//	//ID Relationship to Blood Banks
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "Store_Bloodbank",
//	joinColumns = {	@JoinColumn(name = "sId")}, 
//				inverseJoinColumns= {@JoinColumn(name = "bId")})
//	private Set<BloodBank> bloodbanks = new HashSet<BloodBank>();
//
//	
//	public Set<Members> getMembers() {
//		return members;
//	}
//
//	public void setMembers(Set<Members> members) {
//		this.members = members;
//	}
//
//	
//	public Set<Medicine> getMedicines() {
//		return medicines;
//	}
//
//	public void setMedicines(Set<Medicine> medicines) {
//		this.medicines = medicines;
//	}
//
//	public Set<BloodBank> getBloodbanks() {
//		return bloodbanks;
//	}
//
//	public void setBloodbanks(Set<BloodBank> bloodbanks) {
//		this.bloodbanks = bloodbanks;
//	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public Store(String storename, String street, String city, String state, Integer zipcode, String country, String type,
		String salestype, String open24, String delivery) {
	this.storename = storename;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.country = country;
	this.type = type;
	this.salestype = salestype;
	this.open24 = open24;
	this.delivery = delivery;
	}

	public Store() {
	}
	
	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getOpen24() {
		return open24;
	}

	public void setOpen24(String open24) {
		this.open24 = open24;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

}
