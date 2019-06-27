package com.techchefs.app.doublecolon;

public class Boy {
	String name;
	double height;
	int age;
	
	public Boy(String name, double height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	void boyDetails() {
		System.out.println("Name is "+this.name);
	}
	
	
}
