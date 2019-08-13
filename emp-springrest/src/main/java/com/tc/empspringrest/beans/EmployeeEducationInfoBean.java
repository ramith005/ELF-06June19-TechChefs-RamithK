package com.tc.empspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_educationinfo")
public class EmployeeEducationInfoBean implements Serializable {
	
	@EmbeddedId
	private EmployeeEducationPKBean educationPKBean;
	@Column(name = "degree_type")
	private String degreeType;
	@Column(name = "college_nm")
	private String collegeNM;
	@Column(name = "university")
	private String university;
	@Column(name = "yop")
	private String yop;
	@Column(name = "percentage")
	private String percentage;
	@Column(name = "location")
	private String location;
	
	public EmployeeEducationPKBean getEducationPKBean() {
		return educationPKBean;
	}
	public void setEducationPKBean(EmployeeEducationPKBean educationPKBean) {
		this.educationPKBean = educationPKBean;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getCollegeNM() {
		return collegeNM;
	}
	public void setCollegeNM(String collegeNM) {
		this.collegeNM = collegeNM;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
