package com.techchefs.hibernateapp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
@Entity
@Table(name = "EMPLOYEE_EXPERIENCE_INFO")
@Data
@ToString
public class EmployeeExperienceInfoBean {
	@EmbeddedId
	private ExperienceInfoPKBean experienceInfoBean;
	
	@Column(name="designation")
	private String designation;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="releaving_date")
	private Date releavingDate;

}
