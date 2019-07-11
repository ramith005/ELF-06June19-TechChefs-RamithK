package com.techchefs.designpatter.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techchefs.designpatter.builder.EmployeeData2.EmployeeData2Builder;

import lombok.Data;
import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {
		MyImmutableClass immutableClass = new MyImmutableClass("Abc asd",16,9986055608L);
		
		log.info("Name "+immutableClass.getName());
		log.info("Age "+immutableClass.getAge());
		log.info("Phone "+immutableClass.getPhone());
		Date date = null;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = format.parse("2012-02-03");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		EmployeeData empData = new EmployeeData(1,"Ramit",29,"Male",200.00,123434,date,1232,"a@b.com","SSE",date ,1,1);
		log.info("Employe Data" +empData.toString());
		
		/*EmployeeData2 data2 = new EmployeeData2
									.EmployeeData2Builder()
									.id(2)
									.name("Ramith")
									.age(29)
									.gender("Male")
									.salary(200.00)
									.phone(1233)
									.joiningDate(date)
									.accountNumber(123334)
									.email("AA@SS.com")
									.designation("SSE")
									.dob(date)
									.managerId(1)
									.departmentId(1)
									.build();*/
		
		EmployeeData2 data2 = new EmployeeData2
									.EmployeeData2Builder()
									.id(2)
									.name("Ramith")
									.age(29)
									.gender("Male")
									.salary(200.00)
									.phone(1233)
									.joiningDate(date)
									.accountNumber(123334)
									.email("AA@SS.com")
									.designation("SSE")
									.dob(date)
									.managerId(1)
									.departmentId(1)
									.build();							
		log.info("Employe Data 2  " +data2.toString());
		
		EmployeeData3 data3 = new EmployeeData3
				.EmployeeData3Builder()
				.id(2)
				.name("Ramith")
				.age(29)
				.gender("Male")
				.salary(200.00)
				.phone(1233)
				.joiningDate(date)
				.accountNumber(123334)
				.email("AA@SS.com")
				.designation("SSE")
				.dob(date)
				.managerId(1)
				.departmentId(1)
				.build();							
		log.info("Employe Data 3  " +data3.toString());
									
	}

}
