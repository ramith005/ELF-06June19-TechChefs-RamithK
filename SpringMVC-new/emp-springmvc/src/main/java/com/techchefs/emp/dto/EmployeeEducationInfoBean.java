package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "EMPLOYEE_EDUCATIONAL_INFO")
@Data
@ToString
public class EmployeeEducationInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeEducationalPKBean educationalInfoBean;
	
	@Column(name="degree_type")
	private String degreeType;
	@Column(name="branch")
	private String branch;
	@Column(name="college_name")
	private String collegeName;
	@Column(name="university")
	private String university;
	@Column(name="yop")
	private String yearOfPassing;
	@Column(name="percentage")
	private double percentage;
	@Column(name="location")
	private String location;

}
