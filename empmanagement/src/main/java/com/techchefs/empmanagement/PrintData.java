package com.techchefs.empmanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.empmanagement.dto.DepartmentInfoBean;

import lombok.extern.java.Log;

@Log
public class PrintData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		DepartmentInfoBean deptInf = session.get(DepartmentInfoBean.class, 4);
	
		log.info("Department Id is "+deptInf.getDeptId());
		log.info("Department Name is "+deptInf.getDeptName());
		
		session.close();
	}

}
