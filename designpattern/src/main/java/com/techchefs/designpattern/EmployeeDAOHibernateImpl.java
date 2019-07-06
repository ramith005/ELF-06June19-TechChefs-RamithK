package com.techchefs.designpattern;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpattern.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllmployeeInfo() {
		//TO DO
		return null;
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
		// TODO Auto-generated method stub
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
