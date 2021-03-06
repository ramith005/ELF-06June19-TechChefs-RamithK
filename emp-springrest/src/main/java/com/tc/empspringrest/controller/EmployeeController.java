package com.tc.empspringrest.controller;

import static com.tc.empspringrest.common.EMPConstants.VIEW_HOMEPAGE;
import static com.tc.empspringrest.common.EMPConstants.DB_INTERACTION_TYPE;
import static com.tc.empspringrest.common.EMPConstants.PROPERTY_FILENAME;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tc.empspringrest.beans.EmployeeAddressInfoBean;
import com.tc.empspringrest.beans.EmployeeEducationInfoBean;
import com.tc.empspringrest.beans.EmployeeExperienceInfoBean;
import com.tc.empspringrest.beans.EmployeeInfoBean;
import com.tc.empspringrest.beans.EmployeeOtherInfoBean;
import com.tc.empspringrest.beans.EmployeeResponse;
import com.tc.empspringrest.dao.EmployeeDao;

@RestController
@RequestMapping("/employee")
@PropertySource(PROPERTY_FILENAME)
public class EmployeeController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@DeleteMapping(path = "/removeEmployee",
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody EmployeeResponse deleteEmployee(@RequestParam("id")int id,HttpServletRequest request) {
		//return dao.deleteEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if(request.getSession(false) !=null) {
			if(dao.deleteEmployeeInfo(id)) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee data deleted successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee data not deleted successfully");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
		
		
	}

	@GetMapping(path = "/getEmployee",
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody EmployeeResponse getEmployee(@RequestParam("empId") int id
			,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if(request.getSession(false) !=null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			if(bean!=null) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee data Found");
				response.setBeans(Arrays.asList(bean));
			}else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee data not Found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
		
	}

	@GetMapping(path = "/getAllEmployee",
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {
		
		EmployeeResponse response = new EmployeeResponse();
		if(request.getSession(false) !=null) {
			List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
			if(beans!=null) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee data Found");
				response.setBeans(beans);
			}else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee data not Found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
		
		
		//return dao.getAllEmployeeInfo();
	}

	@PostMapping(value = "/createEmployee",
			produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean bean, ModelMap map) {
		EmployeeResponse response = new EmployeeResponse();
		
		
		List<EmployeeEducationInfoBean> eduBeans = bean.getEducationInfoBeans();
		for (EmployeeEducationInfoBean employeeEducationInfoBean : eduBeans) {
			employeeEducationInfoBean.getEducationPKBean().setInfoBean(bean);
		}
		List<EmployeeAddressInfoBean> addressBeans = bean.getAddressInfoBeans();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressBeans) {
			employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
			employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeOtherInfoBean otherInfo = bean.getOtherInfo();
		otherInfo.setInfoBean(bean);

		//bean.setMngrId(dao.getEmployeeInfo(managerId));
		/*
		boolean result = dao.createEmployeeInfo(bean);
		if (result) {
			map.addAttribute("msg", "Employee added Successfully!!!");
			return true;
		}
		map.addAttribute("msg", "Employee insertion failed!!!");
		return false;
		*/
		if(dao.createEmployeeInfo(bean)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not inserted successfully");
		}
		return response;
	}

	@PutMapping(path = "/updateEmployee",
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody EmployeeResponse updateEmployee(EmployeeInfoBean bean, int managerId, ModelMap map, HttpSession session
			,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if(request.getSession(false) !=null) {
			if(dao.updateEmployeeInfo(bean)) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee data updated successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee data not updated successfully");
			}
			
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
		
		/*
		List<EmployeeEducationInfoBean> eduBeans = bean.getEducationInfoBeans();
		for (EmployeeEducationInfoBean employeeEducationInfoBean : eduBeans) {
			employeeEducationInfoBean.getEducationPKBean().setInfoBean(bean);
		}
		List<EmployeeAddressInfoBean> addressBeans = bean.getAddressInfoBeans();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressBeans) {
			employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
			employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeOtherInfoBean otherInfo = bean.getOtherInfo();
		otherInfo.setInfoBean(bean);

		bean.setMngrId(dao.getEmployeeInfo(managerId));
		boolean result = dao.updateEmployeeInfo(bean);
		if (result) {
			map.addAttribute("msg", "Employee updated Successfully!!!");
			session.setAttribute("bean", bean);
			return true;
		}
		map.addAttribute("msg", "Employee updation failed!!!");
		return false;*/
	}
}
