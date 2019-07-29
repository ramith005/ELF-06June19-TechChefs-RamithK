package com.techchefs.emp.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.UserBean;
import com.techchefs.springmvc.dao.EmployeeDAO;
import com.techchefs.springmvc.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/session")
@PropertySource("classpath:msg.properties")
public class SessionController {

	@GetMapping("/loginForm")
	public String login() {
		return "login";
	}//End of Login()
	
	@PostMapping("/login")
	public String authenticate(UserBean userBean,ModelMap modelMap,HttpServletRequest req) {
		//Fetch the user id and the password
		int userId = userBean.getUserId();
		String password = userBean.getPassword();
		
		// Interact with DB and fetch the login info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(userId);
		
		boolean loginSuccess = false;
		HttpSession session = null;
		String jspPage ;
		
		if (password != null && bean != null && password.equals(bean.getPassword())) {
			session = req.getSession(true);
			loginSuccess = true;
			jspPage ="home";
			session.setAttribute("userBean", userBean);
			modelMap.addAttribute("userBean", bean);
		} else {
			jspPage ="LoginFail";
		}
		
		return jspPage;
	}//End of authenticate()
	
	@GetMapping("/logout")
	public String logoutuser(HttpSession session,ModelMap modelMap,@Value("${logoutmsg}") String msg) {
		
		//invalidate the session
		//String msg = "Thank you for visiting our site";
		session.invalidate();
		modelMap.addAttribute("msg", msg);		
		
		return "login";
	}// End of logoutuser()
	
	@GetMapping("/validate")
	public String validateSession(HttpSession session,ModelMap modelMap,@RequestParam String url) {
		if(session.isNew()) {
			modelMap.addAttribute("msg","Please Login First !");
			session.invalidate();
			return "login";
		}
		
		return "forward:/session/"+url;
	} // End of validateSession()
	
	@PostMapping("/validate")
	public String validateSession4Post(HttpSession session,ModelMap modelMap,@RequestParam String url) {
		return validateSession(session, modelMap, url);
	}
	
	@GetMapping("/validate3/{url}")
	public String validateSession3(HttpSession session,ModelMap modelMap,@PathVariable("url") String url) {
		if(session.isNew()) {
			modelMap.addAttribute("msg","Please Login First !");
			session.invalidate();
			return "login";
		}
		
		return "forward:/session/"+url;
	} // End of validateSession()
	
	@GetMapping("/search")
	public String search(ModelMap modelMap, @RequestParam int empid,@SessionAttribute(name = "userBean",required = false) UserBean userBean) {
		//Fetch the Employee Id from the Login Form  
		modelMap.addAttribute("empid", empid);
		return "search";
	}
}// End of Controller
