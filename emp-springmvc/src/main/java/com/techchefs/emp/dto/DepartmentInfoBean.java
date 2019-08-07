package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial                                                                                  ")
@Data
@Entity
@Table(name="department_info")
public class DepartmentInfoBean implements Serializable {
	@Id
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="department_name")
	private String deptName;

}
