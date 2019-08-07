package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "employee_other_info")
public class EmployeeOtherInfoBean implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	
	@Column(name = "ismarried")
	private boolean isMarried;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "ischallenged")
	private boolean ischallenged;

	@Column(name = "emergency_contact_number")
	private long emergencyContactNumber;

	@Column(name = "emergency_contact_person")
	private String emergencyContactPerson;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "religion")
	private String religion;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "spouse_name")
	private String spouseName;

	@Column(name = "passport")
	private String passport;

	@Column(name = "adhar")
	private long adhar;

	@Column(name = "pan")
	private String pan;


}
