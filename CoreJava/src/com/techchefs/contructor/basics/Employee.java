package com.techchefs.contructor.basics;

public class Employee {
	String name;
	int age;
	double salary;
	
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee name is "+this.name);
		System.out.println("Employee age is "+this.age);
		System.out.println("Employee salary is "+this.salary);
	}
}
