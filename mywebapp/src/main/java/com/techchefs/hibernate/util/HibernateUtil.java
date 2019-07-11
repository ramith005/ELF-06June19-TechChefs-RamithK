package com.techchefs.hibernate.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;




public class HibernateUtil {
private static SessionFactory sfactory = null;
	
	private HibernateUtil() {}
	
	public static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure()
					.addAnnotatedClass(EmployeeInfoBean.class)
					.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		if(sfactory == null) {
			sfactory = buildSessionFactory();
		}
		return sfactory;
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
