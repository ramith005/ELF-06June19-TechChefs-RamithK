package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	
	private static SessionFactory factory;
	
	//private Constructor
	private HibernateCacheUtil() {
		
	}
	
	private static SessionFactory buildSessionFactory() {
		if(factory==null) {
			factory = new Configuration()
					.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml")
					.addAnnotatedClass(EmployeeInfoBean.class)
					.buildSessionFactory();
		}
		return factory;
	}
	
	public static Session openSession() {
		return buildSessionFactory().openSession();
	}
	
}
