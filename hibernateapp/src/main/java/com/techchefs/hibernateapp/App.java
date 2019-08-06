package com.techchefs.hibernateapp;

import java.util.Arrays;

import com.techchefs.hibernateapp.dto.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeAdressPKBean;
import com.techchefs.hibernateapp.dto.EmployeeEducationInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeEducationalPKBean;
import com.techchefs.hibernateapp.dto.EmployeeExperienceInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;
import com.techchefs.hibernateapp.dto.ExperienceInfoPKBean;
import com.techchefs.hibernateapp.dto.TranningInfoBean;
import com.techchefs.hibernateapp.model.HibernateImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeInfoBean bean = new EmployeeInfoBean();
    	bean.setId(200);
    	bean.setName("Ramith");
    	bean.setDesignation("SD");
    	bean.setAccountNumber(1221);
    	bean.setEmail("asa@sds.com");
    	
    	EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
    	otherInfoBean.setAdhar(1211212);
    	otherInfoBean.setPan("PAN12323");
    	otherInfoBean.setEmergencyContactPerson("sdd");
    	otherInfoBean.setFatherName("Rajan");
    	otherInfoBean.setInfoBean(bean);
    	
    	bean.setEmployeeOtherInfoBean(otherInfoBean);
    	
    	EmployeeAdressPKBean addressPKBean1 = new EmployeeAdressPKBean();
    	addressPKBean1.setAddressType("T");
    	addressPKBean1.setInfoBean(bean);
    	
    	EmployeeAdressPKBean addressPKBean2 = new EmployeeAdressPKBean();
    	addressPKBean2.setAddressType("P");
    	addressPKBean2.setInfoBean(bean);
    	
    	EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
    	addressInfoBean1.setAddressInfoBean(addressPKBean1);
    	addressInfoBean1.setAddressOne("abc");
    	
    	EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
    	addressInfoBean2.setAddressInfoBean(addressPKBean2);
    	addressInfoBean2.setAddressOne("xyz");
    	
    	bean.setAddressInfoBean(Arrays.asList(addressInfoBean1,addressInfoBean2));
    	
    	EmployeeEducationalPKBean educationalPKBean1 = new EmployeeEducationalPKBean();
    	educationalPKBean1.setEducationType("BE");
    	educationalPKBean1.setInfoBean(bean);
    	
    	EmployeeEducationalPKBean educationalPKBean2 = new EmployeeEducationalPKBean();
    	educationalPKBean2.setEducationType("Mtech");
    	educationalPKBean2.setInfoBean(bean);
    	
    	EmployeeEducationalPKBean educationalPKBean3 = new EmployeeEducationalPKBean();
    	educationalPKBean3.setEducationType("Mphil");
    	educationalPKBean3.setInfoBean(bean);
    	
    	EmployeeEducationInfoBean educationalInfoBean1 = new EmployeeEducationInfoBean();
    	educationalInfoBean1.setEducationalInfoBean(educationalPKBean1);
    	educationalInfoBean1.setCollegeName("college");
    	educationalInfoBean1.setLocation("Kannur");
    	educationalInfoBean1.setPercentage(Double.parseDouble("84.6"));
    	educationalInfoBean1.setUniversity("Kannur");
    	educationalInfoBean1.setYearOfPassing("2014");
    	
    	EmployeeEducationInfoBean educationalInfoBean2 = new EmployeeEducationInfoBean();
    	educationalInfoBean2.setEducationalInfoBean(educationalPKBean2);
    	educationalInfoBean2.setCollegeName("college2");
    	educationalInfoBean2.setLocation("Delhi");
    	educationalInfoBean2.setPercentage(Double.parseDouble("85.6"));
    	educationalInfoBean2.setUniversity("delhi");
    	educationalInfoBean2.setYearOfPassing("2016");
    	
    	EmployeeEducationInfoBean educationalInfoBean3 = new EmployeeEducationInfoBean();
    	educationalInfoBean3.setEducationalInfoBean(educationalPKBean3);
    	educationalInfoBean3.setCollegeName("college3");
    	educationalInfoBean3.setLocation("Delhi");
    	educationalInfoBean3.setPercentage(Double.parseDouble("95.6"));
    	educationalInfoBean3.setUniversity("kanpur");
    	educationalInfoBean3.setYearOfPassing("2018");
    	
    	bean.setEducationalInfoBeans(Arrays.asList(educationalInfoBean1,educationalInfoBean2,educationalInfoBean3));
    	
    	ExperienceInfoPKBean experiencePKBean1 = new ExperienceInfoPKBean();
    	experiencePKBean1.setCompanyName("IBM");
    	experiencePKBean1.setInfoBean(bean);
    	
    	EmployeeExperienceInfoBean expInfoBean1 =  new EmployeeExperienceInfoBean();
    	expInfoBean1.setDesignation("Web Developer");
    	expInfoBean1.setExperienceInfoBean(experiencePKBean1);
    	
    	ExperienceInfoPKBean experiencePKBean2 = new ExperienceInfoPKBean();
    	experiencePKBean2.setCompanyName("INFY");
    	experiencePKBean2.setInfoBean(bean);
    	
    	EmployeeExperienceInfoBean expInfoBean2 =  new EmployeeExperienceInfoBean();
    	expInfoBean2.setDesignation("SSE");
    	expInfoBean2.setExperienceInfoBean(experiencePKBean2);
    	
    	bean.setExperienceInfoBean(Arrays.asList(expInfoBean1,expInfoBean2));
    	
    	HibernateImpl impl = new HibernateImpl();
    	impl.createEmployee(bean);
    	
    	TranningInfoBean trainingInfoBean = new TranningInfoBean();
    	trainingInfoBean.setCourseId(101);
    	trainingInfoBean.setCourseName("Java");
    	trainingInfoBean.setDuration("123");
    	
    	EmployeeInfoBean bean1 = impl.getEmployeeInfoBean(200);
    	
    	trainingInfoBean.setInfoBeans(Arrays.asList(bean1));
    	
    	/*TranningInfoBean trainingInfoBean = new TranningInfoBean();
    	trainingInfoBean.setCourseId(101);
    	trainingInfoBean.setCourseName("Java");
    	trainingInfoBean.setDuration("123");
    	
    	HibernateImpl impl = new HibernateImpl();
    	EmployeeInfoBean bean1 = impl.getEmployeeInfoBean(1);
    	EmployeeInfoBean bean2 = impl.getEmployeeInfoBean(4);
    	
    	trainingInfoBean.setInfoBeans(Arrays.asList(bean1,bean2));
    	impl.createTrainingDetail(trainingInfoBean);
    	*/
    	/*
    	EmployeeInfoBean bean = new EmployeeInfoBean();
    	bean.setId(2);
    	bean.setName("Ramith");
    	bean.setDesignation("SD");
    	bean.setAccountNumber(1221);
    	bean.setEmail("asa@sds.com");
    	
    	EmployeeInfoBean bean2 = new EmployeeInfoBean();
    	bean.setId(3);
    	bean.setName("Ramith");
    	bean.setDesignation("SD");
    	bean.setAccountNumber(1221);
    	bean.setEmail("asa@sds.com");
    	
    	EmployeeInfoBean bean3 = new EmployeeInfoBean();
    	bean.setId(4);
    	bean.setName("Ramith");
    	bean.setDesignation("SD");
    	bean.setAccountNumber(1221);
    	bean.setEmail("asa@sds.com");
    	
    	TranningInfoBean trainingInfoBean = new TranningInfoBean();
    	trainingInfoBean.setCourseId(101);
    	trainingInfoBean.setCourseName("Java");
    	trainingInfoBean.setDuration("123");
    	
    	trainingInfoBean.setInfoBeans(Arrays.asList(bean,bean2,bean3));
    	
    	HibernateImpl impl = new HibernateImpl();
    	impl.createEmployee(bean);
    	impl.createEmployee(bean2);
    	impl.createEmployee(bean3);
    	*/
    	
    	/*
    	EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
    	otherInfoBean.setAdhar(1211212);
    	otherInfoBean.setPan("PAN12323");
    	otherInfoBean.setEmergencyContactPerson("sdd");
    	otherInfoBean.setFatherName("Rajan");
    	otherInfoBean.setInfoBean(bean);
    	
    	EmployeeAdressPKBean addressPKBean1 = new EmployeeAdressPKBean();
    	addressPKBean1.setAddressType("T");
    	addressPKBean1.setInfoBean(bean);
    	
    	EmployeeAdressPKBean addressPKBean2 = new EmployeeAdressPKBean();
    	addressPKBean2.setAddressType("P");
    	addressPKBean2.setInfoBean(bean);
    	
    	EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
    	addressInfoBean1.setAddressInfoBean(addressPKBean1);
    	addressInfoBean1.setAddressOne("abc");
    	
    	EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
    	addressInfoBean2.setAddressInfoBean(addressPKBean2);
    	addressInfoBean2.setAddressOne("xyz");
    	
    	EmployeeEducationalPKBean educationalPKBean1 = new EmployeeEducationalPKBean();
    	educationalPKBean1.setEducationType("BE");
    	educationalPKBean1.setInfoBean(bean);
    	
    	EmployeeEducationalPKBean educationalPKBean2 = new EmployeeEducationalPKBean();
    	educationalPKBean2.setEducationType("Mtech");
    	educationalPKBean2.setInfoBean(bean);
    	
    	EmployeeEducationalPKBean educationalPKBean3 = new EmployeeEducationalPKBean();
    	educationalPKBean3.setEducationType("Mphil");
    	educationalPKBean3.setInfoBean(bean);
    	
    	EmployeeEducationInfoBean educationalInfoBean1 = new EmployeeEducationInfoBean();
    	educationalInfoBean1.setEducationalInfoBean(educationalPKBean1);
    	educationalInfoBean1.setCollegeName("college");
    	educationalInfoBean1.setLocation("Kannur");
    	educationalInfoBean1.setPercentage(Double.parseDouble("84.6"));
    	educationalInfoBean1.setUniversity("Kannur");
    	educationalInfoBean1.setYearOfPassing("2014");
    	
    	EmployeeEducationInfoBean educationalInfoBean2 = new EmployeeEducationInfoBean();
    	educationalInfoBean2.setEducationalInfoBean(educationalPKBean2);
    	educationalInfoBean2.setCollegeName("college2");
    	educationalInfoBean2.setLocation("Delhi");
    	educationalInfoBean2.setPercentage(Double.parseDouble("85.6"));
    	educationalInfoBean2.setUniversity("delhi");
    	educationalInfoBean2.setYearOfPassing("2016");
    	
    	EmployeeEducationInfoBean educationalInfoBean3 = new EmployeeEducationInfoBean();
    	educationalInfoBean3.setEducationalInfoBean(educationalPKBean3);
    	educationalInfoBean3.setCollegeName("college3");
    	educationalInfoBean3.setLocation("Delhi");
    	educationalInfoBean3.setPercentage(Double.parseDouble("95.6"));
    	educationalInfoBean3.setUniversity("kanpur");
    	educationalInfoBean3.setYearOfPassing("2018");
    	
    	
    	ExperienceInfoPKBean experiencePKBean1 = new ExperienceInfoPKBean();
    	experiencePKBean1.setCompanyName("IBM");
    	experiencePKBean1.setInfoBean(bean);
    	
    	EmployeeExperienceInfoBean expInfoBean1 =  new EmployeeExperienceInfoBean();
    	expInfoBean1.setDesignation("Web Developer");
    	expInfoBean1.setExperienceInfoBean(experiencePKBean1);
    	
    	ExperienceInfoPKBean experiencePKBean2 = new ExperienceInfoPKBean();
    	experiencePKBean2.setCompanyName("INFY");
    	experiencePKBean2.setInfoBean(bean);
    	
    	EmployeeExperienceInfoBean expInfoBean2 =  new EmployeeExperienceInfoBean();
    	expInfoBean2.setDesignation("SSE");
    	expInfoBean2.setExperienceInfoBean(experiencePKBean2);
    	
    	HibernateImpl impl = new HibernateImpl();
    	impl.createEmployee(bean, otherInfoBean,
    			Arrays.asList(addressInfoBean1,addressInfoBean2),
    			Arrays.asList(educationalInfoBean1,educationalInfoBean2,educationalInfoBean3),
    			Arrays.asList(expInfoBean1,expInfoBean2));
        //System.out.println( "Hello World!");
         */
    }
}
