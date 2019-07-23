package com.techchefs.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.UserBean;
import com.techchefs.springmvc.dao.EmployeeDAO;
import com.techchefs.springmvc.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/login")
public class Logincontroller {
	
	@GetMapping("/getLogin")
	public String getForm() {
		return "login"; //Name of the JSP file :: prefix and suffix configured in the xml file
	}//End of getForm
	
	@PostMapping("/validate")
	public String submitform2(int userId,String password,ModelMap modelMap) {
		
		// Interact with DB and fetch the login info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(userId);
		
		boolean loginSuccess = false;
		HttpSession session = null;
		String jspPage ;
		
		if (password != null && bean != null && password.equals(bean.getPassword())) {
			loginSuccess = true;
			jspPage ="home";
			modelMap.addAttribute("userBean", bean);
		} else {
			jspPage ="LoginFail";
		}
		
		return jspPage;
	}
}
