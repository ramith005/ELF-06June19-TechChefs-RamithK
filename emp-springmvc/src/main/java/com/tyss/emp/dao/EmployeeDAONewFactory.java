package com.tyss.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAONewFactory {

	private EmployeeDAONewFactory() {
	}
	@Bean("hibernate")
	public static EmployeeDAO getHibernateInstanceImpl() {
		return new EmployeeDAOHibernateImpl2();
	} //end of getHibernateInstanceImpl()
	
	@Bean("jbdc")
	public static EmployeeDAO getJDBCInstanceImpl() {
		return null;
	}//end of  getJDBCInstanceImpl()
	
}//end of class
