package com.techchefs.hibernatespring.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.hibernatespring.bean.EmployeeInfoBean;
import com.techchefs.hibernatespring.config.HibernateConfig;

public class AddEmployee {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		
		Session session = factory.openSession();
		EmployeeInfoBean empbean = new EmployeeInfoBean();
		
		empbean.setId(101);
		empbean.setName("Ramith");
		empbean.setAge(29);
		empbean.setGender("M");
		empbean.setSalary(1000);
		empbean.setPhone(9983122);
		//empbean.setJoiningDate(joiningDate);
		empbean.setAccountNumber(123343);
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(empbean);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		session.close();
	}
}
