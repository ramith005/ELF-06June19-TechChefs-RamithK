package com.tc.empspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "employee_addressinfo")
public class EmployeeAddressInfoBean implements Serializable {
	
	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;
	@Column(name = "address1")
	private String address1;
	@Column(name = "address2")
	private String address2;
	@Column(name = "landmark")
	private String landmark;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "pin")
	private Integer pin;
	public EmployeeAddressPKBean getAddressPKBean() {
		return addressPKBean;
	}
	public void setAddressPKBean(EmployeeAddressPKBean addressPKBean) {
		this.addressPKBean = addressPKBean;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
