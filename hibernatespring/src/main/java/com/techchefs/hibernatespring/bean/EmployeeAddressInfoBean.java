package com.techchefs.hibernatespring.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeAddressInfoBean {
	private int id;  
	private String addressType;
	private String addressOne;
	private String  addressTwo;
	private String landmark;
	private String  city;
	private String state;
	private String country;
	private int pin;

}
