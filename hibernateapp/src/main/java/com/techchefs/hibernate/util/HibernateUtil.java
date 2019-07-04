package com.techchefs.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory sfactory = null;
		
	public static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		//Session session = sfactory.openSession();
		
		return sfactory;
	}
	
	public static SessionFactory getSessionFactory() {
		if(sfactory == null) {
			sfactory = buildSessionFactory();
		}
		return sfactory;
	}
}
