package com.tyss.emp.dao;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {
	}
	public static EmployeeDAO getInstance(String dbInstancetype) {
		EmployeeDAO dao = null;
		if (dbInstancetype.equals("jdbc")) {
			dao = null;
		} else if (dbInstancetype.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}
		return dao;
	}  // End of get
}
