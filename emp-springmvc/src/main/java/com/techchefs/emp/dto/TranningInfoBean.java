package com.techchefs.emp.dto;

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
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TRAINING_INFO")
@Data
public class TranningInfoBean implements Serializable {
	@Id
	@Column(name="course_id")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="duration")
	private String duration;
	@Column(name="course_type")
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EMPLOYEE_TRAINING",
				joinColumns = {@JoinColumn(name = "COURSE_ID")},
				inverseJoinColumns = {@JoinColumn(name = "ID")})
	List<EmployeeInfoBean> infoBeans;
}// End of Class
