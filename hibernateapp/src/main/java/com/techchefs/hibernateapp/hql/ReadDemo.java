package com.techchefs.hibernateapp.hql;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory sfactory = cfg.buildSessionFactory();
		
		//SessionFactory sfactory = HibernateUtil.getSessionFactory();
		Session session = sfactory.openSession();
		
		// Write the query to fetch all the data from the Bean class'EmployeeInfoBean'
		// and store in a String
		/*
		 * String hql = " from EmployeeInfoBean"; Query query =
		 * session.createQuery(hql); List<EmployeeInfoBean> employeeInfoBeans =
		 * query.list();
		 * 
		 * for(EmployeeInfoBean employeeInfoBean:employeeInfoBeans) {
		 * log.info("ID "+employeeInfoBean.getId());
		 * log.info("Name "+employeeInfoBean.getName()); }
		 */
		
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		//List<ItemBean> itemBeans = query.list();
		List<String> ename = query.list();
		
		for(String empName:ename) {
			log.info("name "+empName);
		}
		
	}

}
