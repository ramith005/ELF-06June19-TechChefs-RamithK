package com.techchefs.hibernate.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {
	private PrepareDataUtil() {}
	
	public static EmployeeInfoBean prepareData(int id) {
		
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(id);
		empInf.setName("new val");
		empInf.setAge(21);
		empInf.setGender("Female");
		empInf.setSalary(1004.23);
		empInf.setPhone(99860223);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");  // pass any format you like      
		Date dateJoining = null;
		try {
			dateJoining = format.parse("2018-11-11");
		} catch (ParseException e) {
			e.printStackTrace();
		}     
		empInf.setJoiningDate(dateJoining);
		
		empInf.setAccountNumber(312434);
		empInf.setEmail("aaa@dff.com");
		
		empInf.setDesignation("PRINCIPAL ENGINEER");
		Date dob = null;
		try {
			dob = format.parse("1990-11-11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		empInf.setDob(dob);
		
		empInf.setMngrId(1);
		empInf.setDeptId(1);
		
		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
		otherInfo.setId(id);
		otherInfo.setAdhar(123122);
		otherInfo.setBloodGroup("O +ve");
		otherInfo.setEmergencycontactNo(123123);
		otherInfo.setEmergencyContactPerson("Neethu");
		otherInfo.setMarried(true);
		otherInfo.setNationality("indian");
		otherInfo.setMotherName("Nirmala");
		otherInfo.setFatherName("PM Rajan");
		otherInfo.setReligion("Hindu");
		otherInfo.setPassportNum("dfdfd1212");
		otherInfo.setPan("ASDSD12312");
		otherInfo.setChallenged(true);
		
		empInf.setOtherinfo(otherInfo);
		
		return empInf;
	}
} // End of Class
