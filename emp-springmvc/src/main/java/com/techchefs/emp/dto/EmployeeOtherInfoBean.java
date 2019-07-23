package com.techchefs.emp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_otherinfo")
@Data
public class EmployeeOtherInfoBean {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="pan")
	private String pan;
	@Column(name="ismarried")
	private boolean isMarried;
	@Column(name="blood_grp")
	private String bloodGroup;
	@Column(name="ischallenged")
	private boolean isChallenged;
	@Column(name="emergency_contact_number")
	private long emergencycontactNo;
	@Column(name="emergency_Contact_Person")
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
