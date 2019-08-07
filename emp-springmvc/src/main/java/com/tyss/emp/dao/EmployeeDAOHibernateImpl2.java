package com.tyss.emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;
import com.tyss.emp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = hibernateUtil.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		return employeeInfoBeans;
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Session session = hibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		if (bean.getId() == id) {
			return bean;
		} else {
			return null;
		}
	}

	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		try {
			EmployeeInfoBean bean = new EmployeeInfoBean();
			bean.setId(id);
			Session session = hibernateUtil.openSession();
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

	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = hibernateUtil.openSession();
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

	public List<EmployeeInfoBean> getEmployeeListInfo(String id) {
		return getEmployeeListInfo(Integer.parseInt(id));
	}

	public List<EmployeeInfoBean> getEmployeeListInfo(int id) {
		String hql = "from EmployeeInfoBean where str(id) like " + "'" + id + "%" + "'";
		Session session = hibernateUtil.openSession();
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();

		return employeeInfoBeans;

	}

	@Override
	public EmployeeOtherInfoBean getEmployeeOtherInfo(int id) {
		EmployeeOtherInfoBean bean = null;
		try (Session session = hibernateUtil.openSession();) {
			bean = session.get(EmployeeOtherInfoBean.class, id);
		}
		return bean;
	}

	@Override
	public EmployeeOtherInfoBean getEmployeeOtherInfo(String id) {
		return getEmployeeOtherInfo(Integer.parseInt(id));
	}
}