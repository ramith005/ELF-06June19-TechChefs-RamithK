package com.techchefs.emp.dao;

import java.util.List;

import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.EmployeeOtherInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();

	List<EmployeeInfoBean> getEmployeeListInfo(String id);

	List<EmployeeInfoBean> getEmployeeListInfo(int id);

	EmployeeOtherInfoBean getEmployeeOtherInfo(int id);

	EmployeeOtherInfoBean getEmployeeOtherInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	EmployeeInfoBean getEmployeeInfo(String id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);

}// End of class
