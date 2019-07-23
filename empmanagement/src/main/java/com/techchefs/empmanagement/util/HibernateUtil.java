package com.techchefs.empmanagement.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.empmanagement.dto.EmployeeInfoBean;
import com.techchefs.empmanagement.dto.EmployeeOtherInfoBean;


public class HibernateUtil {
	private static SessionFactory sfactory;
    
	private HibernateUtil() {}
	
	public static SessionFactory buildSessionFactory() {
		return new Configuration()
							.configure()
							.addAnnotatedClass(EmployeeInfoBean.class)
							.addAnnotatedClass(EmployeeOtherInfoBean.class)
							.buildSessionFactory();
		
		/*cfg.configure("hibernate.cfg.xml");
		SessionFactory sfactory = cfg.buildSessionFactory();
		return sfactory;*/
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
