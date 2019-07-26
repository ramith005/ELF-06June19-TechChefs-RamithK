package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertRecord {

	public static void main(String[] args) {
		SessionFactory fact = HibernateUtil.getSessionFactory();
		Session session = fact.openSession();
		
		String hql = "INSERT INTO EmployeeTest(id,name,email) SELECT id,name,email FROM EmployeeInfoBean WHERE ID=1";
		Query query = session.createQuery(hql);
		
		Transaction transcation = null;
		try {
			transcation = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Insert result "+result);
			transcation.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transcation.rollback();
		} finally {
			session.close();	
		}
	}

}
