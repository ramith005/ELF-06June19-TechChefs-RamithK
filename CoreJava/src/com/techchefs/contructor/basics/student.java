package com.techchefs.contructor.basics;

public class student {
	String name;
	int age;
	double percent;
	
	student(String n,int a,double p){
		name = n;
		age=a;
		percent =p;
	}
	
	void display() {
		System.out.println("student name is "+name);
		System.out.println("student age is "+age);
		System.out.println("student percentage is "+percent);
	}
}
