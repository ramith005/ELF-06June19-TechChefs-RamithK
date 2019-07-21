package com.techchefs.hibernatespring.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeOtherInfoBean {
	private int id;             
	private String pan;         
	private boolean isMarried;       
	private String bloodGroup;      
	private boolean isChallenged;        
	private long emergencycontactNo;
	private String emergencyContactPerson;
	private String nationality;        
	private String religion;     
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNum;
	private long adhar;

}
