package com.techchefs.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class GetAllDetail {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> emp =criteria.list();
		
		for(EmployeeInfoBean employeeInfoBean: emp) {
			log.info("ID="+employeeInfoBean.getId());
			log.info("Name="+employeeInfoBean.getName());
			log.info("Email="+employeeInfoBean.getEmail());
			log.info("Designation="+employeeInfoBean.getDesignation());
		}
	}
}
