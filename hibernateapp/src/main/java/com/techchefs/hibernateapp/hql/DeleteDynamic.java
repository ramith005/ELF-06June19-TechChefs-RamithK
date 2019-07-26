package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DeleteDynamic {

	public static void main(String[] args) {
		SessionFactory fact = HibernateUtil.getSessionFactory();
		Session session = fact.openSession();
		
		String hql = "delete from EmployeeInfoBean where id=:empid";
		Query query = session.createQuery(hql);
		query.setParameter("empid", 8);
		Transaction transcation = null;
		
		try {
			transcation = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Delete result "+result);
			transcation.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transcation.rollback();
		} finally {
			session.close();	
		}
	}

}
