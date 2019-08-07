package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "EMPLOYEE_ADDRESS_INFO")
@Data
@ToString
public class EmployeeAddressInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeAdressPKBean addressInfoBean;
	
	@Column(name="address1")
	private String addressOne;
	@Column(name="address2")
	private String  addressTwo;
	@Column(name="landmark")
	private String landmark;
	@Column(name="city")
	private String  city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pin")
	private int pin;

}
