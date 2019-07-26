package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTestTwo {

	public static void main(String[] args) {
		log.info("1st Time "+getemployeeData(1).toString());
		log.info("2nd Time "+getemployeeData(1).toString());
		log.info("3rd Time "+getemployeeData(1).toString());
		
	}// End Main
	
	private static EmployeeInfoBean getemployeeData(int id) {
				/*//1.Load the Config file
				Configuration config = new Configuration();
				config.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
				config.addAnnotatedClass(EmployeeInfoBean.class);
				
				//2.Build the Session Factory
				SessionFactory sessionFactory = config.buildSessionFactory();
				
				//3.Open Session
				Session session = sessionFactory.openSession();
				
				//4.Interact with DB via Session
				EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, 1);
				
				
				//5.Close the session
				session.close();
				return bean;*/
				EmployeeInfoBean bean;
				
				try(Session session = HibernateCacheUtil.openSession()){
					bean = session.get(EmployeeInfoBean.class, id);
				}
				return bean;
		
	}

}//End Class
