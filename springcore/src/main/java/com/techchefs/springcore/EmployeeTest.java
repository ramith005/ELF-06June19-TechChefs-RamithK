package com.techchefs.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.spring.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*EmployeeBean emp1 = (EmployeeBean) context.getBean("emp1");
		EmployeeBean emp2 = (EmployeeBean) context.getBean("emp1");
		
		Scanner sc = new Scanner(System.in);
		
		log.info("Enter Name");
		emp1.setName(sc.nextLine());
		sc.nextLine();
		log.info("Enter ID");
		emp1.setId(sc.nextInt());
		
		log.info("Enter Name");
		emp2.setName(sc.nextLine());
		sc.nextLine();
		log.info("Enter ID");
		emp2.setId(sc.nextInt());
		
		
		log.info("Name is "+emp1.getName());
		log.info("ID is "+emp1.getId());
		
		log.info("Name is "+emp2.getName());
		log.info("ID is "+emp2.getId());*/
	    
		EmployeeBean employee1 = (EmployeeBean) context.getBean("employee1");
		
		log.info("Department name :: "+employee1.getDepartmentBean().getDeptName());
		log.info("Department Id :: "+employee1.getDepartmentBean().getDeptId());
		
		log.info("Employee Id :: "+employee1.getId());
		log.info("Employee Name :: "+employee1.getName());
		((AbstractApplicationContext) context).close();
	}

}
