package com.techchefs.designpattern;

import java.util.ArrayList;
import java.util.List;

import com.techchefs.designpattern.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	boolean createEmployee(EmployeeInfoBean bean);
	boolean updateEmployee(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
} // end of Interface
