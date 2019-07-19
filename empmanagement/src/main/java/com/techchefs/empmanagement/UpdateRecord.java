package com.techchefs.empmanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.empmanagement.dto.DepartmentInfoBean;

public class UpdateRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		DepartmentInfoBean deptInf = session.get(DepartmentInfoBean.class, 4);
		deptInf.setDeptName("IT Dept");
		
		Transaction transaction = session.beginTransaction();
		session.update(deptInf);
		transaction.commit();
		session.close();
	}

}
