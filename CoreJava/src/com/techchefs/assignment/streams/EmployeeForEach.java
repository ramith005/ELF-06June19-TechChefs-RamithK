package com.techchefs.assignment.streams;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeeForEach {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "mothi", 45000.0, 1.4, "sofware engineer");
		Employee e2 = new Employee(2, "moin", 25000.0, 2.0, "sofware developer");
		Employee e3 = new Employee(3, "monika", 5000.0, 0.4, "IPs officer");
		Employee e4 = new Employee(5, "manoj", 35000.0, 2.4, "tester");
		Employee e5 = new Employee(4, "mohan", 15000.0, 1.2, "unit tester");
		Employee e6 = new Employee(6, "minath", 65000.0, 6.4, "software engineer");

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);

		for (Employee emp : al) {
			if (emp.experience >= 2)
				log.info("" + emp);
		}

	}
}
