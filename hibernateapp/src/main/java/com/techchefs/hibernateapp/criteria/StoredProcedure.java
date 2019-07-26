package com.techchefs.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class StoredProcedure {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("emp_sp");
		//List<Object[]> str = query.getResultList();
		
		List<Object[]> result =query.getResultList();
		
		for(Object[] obj : result) {
			log.info("id "+obj[0]);
			log.info("Name "+obj[1]);
			log.info("Email "+obj[8]);
		}
		
	}

}
