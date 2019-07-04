package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.DepartmentInfoBean;

import lombok.extern.java.Log;

@Log
public class DeleteDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		DepartmentInfoBean deptInf = session.get(DepartmentInfoBean.class, 6);
	
		log.info("Department Id is "+deptInf.getDeptId());
		log.info("Department Name is "+deptInf.getDeptName());
		
		Transaction transaction = session.beginTransaction();
		session.delete(deptInf);
		transaction.commit();
		session.close();
	}

}
