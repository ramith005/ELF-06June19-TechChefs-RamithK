package com.techchefs.warehouse.testapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.warehouse.beans.ItemBean;
import com.techchefs.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetItems {
	
	public static void main(String[] args) {
		/*Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		
		Session session = factory.openSession();
		
		ItemBean item  = session.get(ItemBean.class,102);
		log.info("Item Name "+item.getName());
		log.info("Item Cost "+item.getCost());
		log.info("Item Description "+item.getDescription());
		log.info("Item Quantity "+item.getQuantity());
		log.info("Item Name "+item.getName());
		
		String hql = "select name  from ItemBean";
		Query query = session.createQuery(hql);
		//List<EmployeeInfoBean> employeeInfoBeans = query.list();
		List<String> items = query.list();
		
		for(String item_name:items) {
			log.info("name "+item_name);
		}
	} // End of main
} // End of Class
