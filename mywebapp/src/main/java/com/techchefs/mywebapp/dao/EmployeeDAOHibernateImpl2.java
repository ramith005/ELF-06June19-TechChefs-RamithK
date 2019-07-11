package com.techchefs.mywebapp.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.mywebapp.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllmployeeInfo() {
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
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		
		return bean;
	}
	/**
	 * Function to save or update the employee
	 */
	public boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	/**
	 * Function to create the employee
	 */
	public boolean createEmployee(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	/**
	 * Function to update the employee
	 */
	public boolean updateEmployee(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	/**
	 * Function to delete the Employee with the employee id passed as integer
	 */
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);		
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	/**
	 * Function to delete the Employee with the employee id passed as integer
	 */
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
