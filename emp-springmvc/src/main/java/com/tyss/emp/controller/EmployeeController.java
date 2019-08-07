package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {

		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of initBinder()


	@GetMapping("/search")
	public String search(int id, ModelMap map) {
		List<EmployeeInfoBean> bean=dao.getEmployeeListInfo(id);
		map.addAttribute("bean", bean);
		return "searchResult";
	}
	
}
