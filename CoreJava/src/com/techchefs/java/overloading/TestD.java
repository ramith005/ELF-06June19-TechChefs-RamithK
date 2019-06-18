package com.techchefs.java.overloading;

public class TestD {

	public static void main(String[] args) {
		SearchEmp emp  = new SearchEmp();
		
		emp.search(100);
		System.out.println("***************");
		emp.search("Ramith");
	}

}
