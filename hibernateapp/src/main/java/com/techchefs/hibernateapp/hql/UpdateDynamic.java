package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateDynamic {

	public static void main(String[] args) {
		SessionFactory fact = HibernateUtil.getSessionFactory();
		Session session = fact.openSession();
		
		//String hql = "update from EmployeeInfoBean set name=:empName where id=:empid";
		String hql = "update from EmployeeInfoBean set name='"+args[1]+"' where id="+args[0];
		Query query = session.createQuery(hql);
//		query.setParameter("empid", 1);
//		query.setParameter("empName", "Ramith KK");
		
//		query.setParameter("empid", Integer.parseInt(args[0]));
//		query.setParameter("empName", args[1]);
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
