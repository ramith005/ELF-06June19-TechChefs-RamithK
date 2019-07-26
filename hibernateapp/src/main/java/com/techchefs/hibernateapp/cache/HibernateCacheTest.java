package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {
		
		//1.Load the Config file
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2.Build the Session Factory
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//3.Open Session
		Session session = sessionFactory.openSession();
		
		//4.Interact with DB via Session
		EmployeeInfoBean bean1 = session.get(EmployeeInfoBean.class, 1);
		log.info("1st Time "+bean1.toString());
		
		EmployeeInfoBean bean2 = session.get(EmployeeInfoBean.class, 1);
		log.info("2nd Time "+bean2.toString());
		
		EmployeeInfoBean bean3 = session.get(EmployeeInfoBean.class, 1);
		log.info("3rd Time "+bean3.toString());
		
		//5.Close the session
		session.close();
		
	}// End of Main

}// End of Class
