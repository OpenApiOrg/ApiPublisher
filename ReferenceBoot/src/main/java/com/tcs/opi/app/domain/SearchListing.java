package com.tcs.opi.app.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchListing {

	@JsonProperty("businessName")
	private String businessName;
	@JsonProperty("city")
	private String city;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("state")
	private String state;
	@JsonProperty("street")
	private String street;
	//private List coupons;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	/*public List getCoupons() {
		return coupons;
	}
	public void setCoupons(List coupons) {
		this.coupons = coupons;
	} */

}