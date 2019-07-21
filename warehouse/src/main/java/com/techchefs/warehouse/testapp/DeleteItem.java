package com.techchefs.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.warehouse.beans.ItemBean;

public class DeleteItem {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		ItemBean item  = session.get(ItemBean.class,102);
		
		Transaction tx = session.beginTransaction();
		session.delete(item);
		
		tx.commit();
	}

}
