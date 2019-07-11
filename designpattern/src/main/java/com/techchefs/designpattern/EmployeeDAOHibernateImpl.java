package com.techchefs.designpattern;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.techchefs.designpattern.beans.EmployeeInfoBean;
import com.techchefs.designpatterns.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllmployeeInfo() {
		// Write the query to fetch all the data from the Bean class'EmployeeInfoBean'
		// and store in a String
		
//			Configuration cfg = new Configuration();
//			cfg.configure("hibernate.cfg.xml");
//			cfg.addAnnotatedClass(EmployeeInfoBean.class);
//			SessionFactory sfactory = cfg.buildSessionFactory();
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			
			  String hql = " from EmployeeInfoBean"; 
			  Query query = session.createQuery(hql); 
			  List<EmployeeInfoBean> employeeInfoBeans = query.list();
			  
				 
		return employeeInfoBeans;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		//1.load the configuration
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.configure("com/techchefs/designpattern/MyHibernateConfigFile.xml");
		//cfg.configure(new File("D:\\MyHibernateConfigFile.xml"));
		//cfg.configure(new URL("https://raw.githubusercontent.com/ramith005/ELF-06June19-TechChefs-RamithK/master/MyHibernateConfigFile.xml"));
		
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2.Build the SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//3.Open session
		Session session = factory.openSession();
		
		//4.Interact with DB via session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		
		//5.close session
		session.close();
		
		return bean;
	}

	@Override
	public boolean createEmployee(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}


}
