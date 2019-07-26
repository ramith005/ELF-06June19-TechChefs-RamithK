package com.techchefs.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class GetDataUsingProjections {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		
		Projection proj = Projections.property("name");
		Projection proj1 = Projections.property("id");
		Projection proj2 = Projections.property("email");
		
		ProjectionList proList = Projections.projectionList();
		
		proList.add(proj);
		proList.add(proj1);
		proList.add(proj2);
		
		criteria.setProjection(proList);
		
		List<Object[]> str =criteria.list();
		
		for(Object[] obj : str) {
			log.info("name "+obj[0]);
			log.info("id "+obj[1]);
			log.info("email "+obj[2]);
		}
		
	}

}
