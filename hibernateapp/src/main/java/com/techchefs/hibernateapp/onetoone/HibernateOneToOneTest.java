package com.techchefs.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.util.HibernateUtil;
import com.techchefs.hibernate.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	
	public static void main(String[] args) throws ParseException {
		
		//Prepare Data
		int id = 17;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
		
	} //End of Main
	
	//Method to save the data
	private static void save(EmployeeInfoBean data) {
		Transaction txn = null;
		try(Session session = HibernateUtil.openSession()){
			txn = session.beginTransaction();
			session.save(data);
			txn.commit();
		} catch(Exception ex) {
			log.severe(Arrays.toString(ex.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
		} //End of Try-catch
	} //End of Save
} // End of Class
