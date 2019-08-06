package com.techchefs.hibernateapp.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeEducationInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeExperienceInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;
import com.techchefs.hibernateapp.dto.TranningInfoBean;


public class HibernateImpl {
	
	private Configuration config = new Configuration();
	private SessionFactory factory = config
							.configure()
							.buildSessionFactory();
	public void createEmployee(EmployeeInfoBean bean,
				EmployeeOtherInfoBean otherInfoBean,
				List<EmployeeAddressInfoBean> addressInfoBean,
				List<EmployeeEducationInfoBean> educationInfoBean,
				List<EmployeeExperienceInfoBean> experienceInfoBean) {
		Session session  = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bean);
		session.save(otherInfoBean);
		//session.save(addressInfoBean);
		
		for(EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			session.save(employeeAddressInfoBean);
		}
		
		for(EmployeeEducationInfoBean employeeEducationInfoBean : educationInfoBean) {
			session.save(employeeEducationInfoBean);
		}
		
		for(EmployeeExperienceInfoBean employeeEperienceInfoBean : experienceInfoBean) {
			session.save(employeeEperienceInfoBean);
		}
		
		transaction.commit();
		session.close();
		
	}//End of createEmployee()
	
	public void createTrainingDetail(TranningInfoBean tranningInfoBean) {
		Session session  = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(tranningInfoBean);
		transaction.commit();
		session.close();
	}
	
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session  = factory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close(); 
		return bean;
	}
	
	public void createEmployee(EmployeeInfoBean bean) {
		Session session  = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(bean);
			transaction.commit();
			session.close();
		} catch(Exception e) {
			System.out.println("Error ...!");
		}
		
	}
}// End of HibernateImpl
