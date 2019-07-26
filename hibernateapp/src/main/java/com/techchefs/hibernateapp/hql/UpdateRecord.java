package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {

	public static void main(String[] args) {
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		cfg.addAnnotatedClass(EmployeeInfoBean.class);
//		SessionFactory sfactory = cfg.buildSessionFactory();
		
		SessionFactory fact = HibernateUtil.getSessionFactory();
		Session session = fact.openSession();
		
		String hql = "update from EmployeeInfoBean set name='Ramith Koyambrath' where id=1";
		Query query = session.createQuery(hql);
		Transaction transcation = null;
		
		try {
			transcation = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated result "+result);
			transcation.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transcation.rollback();
		} finally {
			session.close();	
		}
		
	}

}
