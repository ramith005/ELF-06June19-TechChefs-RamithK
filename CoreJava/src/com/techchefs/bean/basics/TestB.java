package com.techchefs.bean.basics;

public class TestB {

	public static void main(String[] args) {
		Employee ee = new Employee("Ramith",123.34,'M',"Testcompany");
		
		Db3 d = new Db3();
//		ee.setName("Ramith");
//		ee.setCompanyame("Test Company");
//		ee.setGender('M');
//		ee.setSalary(123.67);
		
		d.receive(ee);

	}

}
