package com.techchefs.mywebapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	boolean createEmployee(EmployeeInfoBean bean);
	boolean updateEmployee(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
} // end of Interface
