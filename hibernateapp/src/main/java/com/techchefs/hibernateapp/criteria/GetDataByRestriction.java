package com.techchefs.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class GetDataByRestriction { //Class to get data with restriction

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		
		//Criterion cr = Restrictions.eq("id", 1); // Equals to
		Criterion cr = Restrictions.gt("salary", Double.parseDouble("1000")); // Greater than condition
		criteria.add(cr);
//		EmployeeInfoBean emp = (EmployeeInfoBean)criteria.uniqueResult();
//		log.info("ID="+emp.getId());
//		log.info("Name="+emp.getName());
//		log.info("Email="+emp.getEmail());
//		log.info("Designation="+emp.getDesignation());
		
		List<EmployeeInfoBean> emp =criteria.list();
		
		for(EmployeeInfoBean employeeInfoBean: emp) {
			log.info("ID="+employeeInfoBean.getId());
			log.info("Name="+employeeInfoBean.getName());
			log.info("Email="+employeeInfoBean.getEmail());
			log.info("Designation="+employeeInfoBean.getDesignation());
		}
	}

}
