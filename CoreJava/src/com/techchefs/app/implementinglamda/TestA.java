package com.techchefs.app.implementinglamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;;

@Log
public class TestA {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Ramith",2000.2);
		Employee e2 = new Employee(2,"Mohib",1000.2);
		Employee e3 = new Employee(3,"Ashutosh",3000.2);
		Employee e4 = new Employee(4,"Dhanya",4000.2);
		Employee e5 = new Employee(5,"Santosh",5000.2);
		
		EmployeeById byId = new EmployeeById();
		TreeSet<Employee> ts = new TreeSet<Employee>(byId);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		Comparator<Employee> c2 = (e,f)->e.name.compareTo(f.name);
		
		for(Employee e : ts) {
			log.info("Id is "+e.id);
			log.info("Name is "+e.name);
			log.info("Salary is "+e.salary);
		}
	}

}
