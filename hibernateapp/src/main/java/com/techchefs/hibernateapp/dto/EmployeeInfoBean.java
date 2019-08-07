package com.techchefs.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_info")
@Data
public class EmployeeInfoBean implements Serializable {
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "addressInfoBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationalInfoBean.infoBean")
	private List<EmployeeEducationInfoBean> educationalInfoBeans;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "experienceInfoBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBean;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "infoBeans")
	private List<TranningInfoBean> trainningInfoBean;
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="phone")
	private long phone;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="account_number")
	private long accountNumber;
	@Column(name="email")
	private String email;
	@Column(name="designation")
	private String designation;
	@Column(name="dob")
	private Date dob;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id")
	private DepartmentInfoBean departmentInfoBean;
	
	@ManyToOne
	@JoinColumn(name = "MNG_ID", referencedColumnName = "ID")
	private EmployeeInfoBean mngrId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="EMP_TRANNING",
			   joinColumns = {@JoinColumn(name = "ID")},
			   inverseJoinColumns = {@JoinColumn(name = "COURSE_ID")})
	private List<TranningInfoBean> tranningInfoBeans;
}
