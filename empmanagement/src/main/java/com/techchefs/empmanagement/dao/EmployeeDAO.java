package com.techchefs.empmanagement.dao;

import java.util.List;

import com.techchefs.empmanagement.dto.EmployeeInfoBean;


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
