package com.techchefs.bean.basics;

public class Employee {
	String Name;
	double salary;
	char gender;
	String companyame;
	
	Employee(String Name,double salary,char gender,String companyame){
		this.Name = Name;
		this.salary = salary;
		this.gender = gender;
		this.companyame = companyame;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCompanyame() {
		return companyame;
	}
	public void setCompanyame(String companyame) {
		this.companyame = companyame;
	}
	
	
}
