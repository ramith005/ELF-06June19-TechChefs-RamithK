package com.techchefs.myapp.bean;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean2 {
	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joingDate;
	private String gender;
		
}//end of class NewEmployee
