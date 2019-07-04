package com.techchefs.xmlmapping.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class DepartmentInfoBean {
	
	private int deptId;
	private String deptName;

}
