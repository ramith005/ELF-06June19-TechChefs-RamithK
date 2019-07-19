package com.techchefs.empmanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.empmanagement.dto.DepartmentInfoBean;
import com.techchefs.empmanagement.dto.EmployeeInfoBean;
import com.techchefs.empmanagement.util.HibernateUtil;

public class SaveDemo {

	public static void main(String[] args) throws ParseException {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		//SessionFactory factory = cfg.buildSessionFactory();
		
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		
		/*EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(8);
		empInf.setName("new val");
		empInf.setAge(21);
		empInf.setGender("Female");
		empInf.setSalary(1004.23);
		empInf.setPhone(99860223);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");  // pass any format you like      
		Date dateJoining = format.parse("2018-11-11");     // first convert user entered date into a Date object
		empInf.setJoiningDate(dateJoining);
		
		empInf.setAccountNumber(312434);
		empInf.setEmail("aaa@dff.com");
		
		empInf.setDesignation("PRINCIPAL ENGINEER");
		Date dob = format.parse("1990-11-11");
		empInf.setDob(dob);
		
		empInf.setMngrId(1);
		empInf.setDeptId(1);*/
		//empInf.set
		
		DepartmentInfoBean deptInf = new DepartmentInfoBean();
		deptInf.setDeptId(6);
		deptInf.setDeptName("QA Test");
		
		Transaction transaction = session.beginTransaction();
		
		session.saveOrUpdate(deptInf);
		transaction.commit();
		session.close();
	}

}
