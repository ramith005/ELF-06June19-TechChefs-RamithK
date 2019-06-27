package com.techchefs.assignment.streams;

import java.util.ArrayList;
import java.util.Comparator;

import com.techchefs.app.stream.StudentTest;

import lombok.extern.java.Log;

@Log
public class EmployeeFilterSalary {
	
	static Comparator<EmployeeNew> c = (a,b) ->{
		if(a.getSalary() > b.getSalary()) {
			return 1;
		} else if(a.getSalary() < b.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	};
	
	static EmployeeNew getMinSalary(ArrayList<EmployeeNew> al) {
		return al.stream().min(c).get();
	}
	
	static EmployeeNew getMaxSalary(ArrayList<EmployeeNew> al) {
		return al.stream().max(c).get();
	}
	public static void main(String[] args) {
		
		EmployeeNew em1 = new EmployeeNew(1,"Ramith",25000);
		EmployeeNew em2 = new EmployeeNew(2,"Santosh",35000);
		EmployeeNew em3 = new EmployeeNew(3,"deekshit",45000);
		EmployeeNew em4 = new EmployeeNew(4,"Mohib",55000);
		
		ArrayList<EmployeeNew> al = new ArrayList<>();
		al.add(em1);
		al.add(em2);
		al.add(em3);
		al.add(em4);
		
		EmployeeNew emp1 = getMaxSalary(al);
		log.info("The max salary is of the employee "+emp1.getName()+" with a salary of "+emp1.getSalary());
		
		EmployeeNew emp2 = getMinSalary(al);
		log.info("The Minimum salary is of the employee "+emp2.getName()+" with a salary of "+emp2.getSalary());
	}

}
