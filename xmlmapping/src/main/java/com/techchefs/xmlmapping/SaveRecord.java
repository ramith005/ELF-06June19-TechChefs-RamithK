package com.techchefs.xmlmapping;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.xmlmapping.dto.DepartmentInfoBean;


public class SaveRecord {

	public static void main(String[] args) {
		DepartmentInfoBean deptInf = new DepartmentInfoBean();
		deptInf.setDeptId(5);
		deptInf.setDeptName("QA Dept");
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tranc = session.beginTransaction();
		
		session.update(deptInf);
		tranc.commit();
		session.close();
	}

}
