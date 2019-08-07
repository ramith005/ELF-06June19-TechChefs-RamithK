package com.techchefs.emp.controller;

import static com.techchefs.emp.common.EMPCommons.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeInfoBean;

import lombok.val;

@Controller
@PropertySource(PROP_PATH)
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of initBinder()

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGINPAGE;
	}// End of loginPage()

	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest req,
			@Value("${invalidlogin}") String msg) {
		
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInstancetype);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean.getPassword().equals(password) && bean.getId() == id) {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			return VIEW_HOMEPAGE;
		} else {
			req.setAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
	}// End of authenticate()
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap, 
			@Value("${logoutmsg}")String logoutmsg) {
		session.invalidate();
		modelMap.addAttribute("msg",logoutmsg);
		return VIEW_LOGINPAGE;
	}// end of logout()
	
	@GetMapping("/create")
	public String getSubmitForm() {
		return "createemp";
	}// end of getSubmitForm()
}
