package com.techchefs.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;

@Log
public class EmployeeBean {
	private String name;
	private int id;
	
	private DepartmentBean departmentBean;
	
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void destroyTest() throws Exception {
		log.info("Destroy ....");
	}
	
	public void afterPropertiesSetTest() throws Exception {
		log.info("Initial ....");
	}
}
