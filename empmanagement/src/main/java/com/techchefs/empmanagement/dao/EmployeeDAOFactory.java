package com.techchefs.empmanagement.dao;

public class EmployeeDAOFactory {
	
	private static String dbInteractionType = "hibernate";
	
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if(dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}
		return dao;
		
	}// End of getInstance()
	
} // End of Class
