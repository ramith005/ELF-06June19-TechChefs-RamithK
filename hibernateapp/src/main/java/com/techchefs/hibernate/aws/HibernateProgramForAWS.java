package com.techchefs.hibernate.aws;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.cache.EmployeeInfoBean;

public class HibernateProgramForAWS {

	public static void main(String[] args) throws Exception {
		Transaction transaction = null;
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(8);
		empInf.setName("new val");
		empInf.setAge(21);
		empInf.setGender("Female");
		empInf.setSalary(1004.23);
		empInf.setPhone(99860223);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");  // pass any format you like      
		Date dateJoining = format.parse("2018-11-11");     // first convert user entered date into a Date object
		empInf.setJoiningDate(dateJoining);
		
		empInf.setAccountNumber(312434);
		empInf.setEmail("aaa@dff.com");
		
		empInf.setDesignation("PRINCIPAL ENGINEER");
		Date dob = format.parse("1990-11-11");
		empInf.setDob(dob);
		
		empInf.setMngrId(1);
		empInf.setDeptId(1);
		
		//1.Load the Config file
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernate/aws/hibernate.cfg.xml");
		config.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2.Build the Session Factory
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//3.Open Session
		Session session = sessionFactory.openSession();
		
		//4.Interact with DB via Session
		try {
			
		} catch(Exception e) {
			
		}
		
		session.close();
	}
	///hibernateapp/src/main/java/com/techchefs/hibernate/aws/hibernate.cfg.xml

}
