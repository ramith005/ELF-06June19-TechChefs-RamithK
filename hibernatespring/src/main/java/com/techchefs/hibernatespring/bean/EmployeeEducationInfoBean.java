package com.techchefs.hibernatespring.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeEducationInfoBean {
	private int id;
	private String educationType;
	private String collegeName;
	private String university;
	private String yearOfPassing;
	private double percentage;
	private String location;

}
