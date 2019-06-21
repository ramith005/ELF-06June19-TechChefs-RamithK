package com.techchefs.myapp.bean;

import java.util.logging.Logger;

public class TestA {

	private static final Logger log = Logger.getLogger("mainmethodClass");
	public static void main(String[] args) {
		
		
		EmployeeBean em = new EmployeeBean();
		log.info("Without lombak JAR  ::"+em.toString());
		
		EmployeeBean2 emp = new EmployeeBean2();
		log.info("******************");
		emp.setAge(29);
		emp.setGender("M");
		log.info("With lombak JAR  ::"+emp.toString());
		
		
		
	}// end of main
}// end of classs testA
