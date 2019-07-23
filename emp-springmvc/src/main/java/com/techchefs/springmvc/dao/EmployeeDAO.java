package com.techchefs.springmvc.dao;

import java.util.List;

import com.techchefs.emp.dto.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllmployeeInfo();
	List<EmployeeInfoBean> getEmployeeListById(int id);
	List<EmployeeInfoBean> getEmployeeListById(String id);
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	boolean createEmployee(EmployeeInfoBean bean);
	boolean updateEmployee(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
} // end of Interface
