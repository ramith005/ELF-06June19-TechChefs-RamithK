package com.techchefs.designpattern.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.techchefs.designpattern.EmployeeDAO;
import com.techchefs.designpattern.EmployeeDAOFactory;
import com.techchefs.designpattern.EmployeeDAOHibernateImpl;
import com.techchefs.designpattern.EmployeeDAOJDBCImpl;
import com.techchefs.designpattern.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

/**
 * DesignPatternTest
 * @author Ramith Koyambrath
 */
@Log
public class DesignPatternTest {
	
    public static void main( String[] args ){
    	//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
    	//EmployeeDAO dao = new EmployeeDAOHibernateImpl();
    	
    	EmployeeDAO dao = EmployeeDAOFactory.getInstance();
//    	printData(dao.getEmployeeInfo(1));
//    	printData(dao.getEmployeeInfo("2"));
    	
		/*
		 * ArrayList<EmployeeInfoBean> beans = dao.getAllmployeeInfo();
		 * for(EmployeeInfoBean bean : beans) { printData(bean); }
		 */
    	
    	//Create an Employee Info
    	EmployeeInfoBean empInf = new EmployeeInfoBean();
//		empInf.setId(10);
//		empInf.setName("new Employee");
//		empInf.setAge(21);
//		empInf.setGender("Female");
//		empInf.setSalary(1004.23);
//		empInf.setPhone(99860223);
//		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");  // pass any format you like      
//		try {
//			Date dateJoining = format.parse("2018-11-11");
//			empInf.setJoiningDate(dateJoining);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}     // first convert user entered date into a Date object
//		//
//		
//		empInf.setAccountNumber(312434);
//		empInf.setEmail("aaa@dff.com");
//		
//		empInf.setDesignation("PRINCIPAL ENGINEER");
//		Date dob;
//		try {
//			dob = format.parse("1990-11-11");
//			empInf.setDob(dob);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		empInf.setManagerId(1);
//		empInf.setDepartmentId(1);
		//log.info("Created employee " +dao.createEmployee(empInf));
    	dao.deleteEmployeeInfo(10);
		log.info("Delete employee " +dao.deleteEmployeeInfo(10));
    }// end of main
    
    private static void printData(EmployeeInfoBean bean) {
    	log.info("******** Employee info *****");
    	log.info("ID : "+bean.getId());
    	log.info("AGE :"+bean.getAge());
    	log.info("GENDER :"+bean.getGender());
    	log.info("SALARY :"+bean.getSalary());
    	log.info("PHONE :"+bean.getPhone());
    	//log.info("JOINING_DATE :"+bean.getJoinningDate());
    	log.info("EMAIL 	:"+bean.getEmail());
    	log.info("DESIGNATION :"+bean.getDesignation());
    	log.info("DOB  :"+bean.getDob());
    	log.info("DEPT_ID:"+bean.getDepartmentId());
    	log.info("MNGR_ID :"+bean.getManagerId());
    }
    
}// end of class
