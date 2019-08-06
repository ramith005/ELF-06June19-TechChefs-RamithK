package com.techchefs.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "EMPLOYEE_OTHERINFO")
@Data
public class EmployeeOtherInfoBean implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	
	//private int id;
	@Column(name="pan")
	private String pan;
	@Column(name="ismarried")
	private boolean isMarried;
	@Column(name="blood_grp")
	private String bloodGroup;
	@Column(name="is_challenged")
	private boolean isChallenged; 
	@Column(name="emergency_contact_number")
	private long emergencycontactNo;
	@Column(name="emergency_contact_person")
	private String emergencyContactPerson;
	@Column(name="nationality")
	private String nationality;
	@Column(name="religion")
	private String religion; 
	@Column(name="father_nm")
	private String fatherName;
	@Column(name="mother_nm")
	private String motherName;
	@Column(name="spouse_nm")
	private String spouseName;
	@Column(name="passport")
	private String passportNum;
	@Column(name="adhar")
	private long adhar;
	

}
