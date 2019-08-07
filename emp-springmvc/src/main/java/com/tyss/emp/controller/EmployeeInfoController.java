package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;
import static com.tyss.emp.common.EMPCommons.*; 
@Controller
@PropertySource(PROP_PATH)
@RequestMapping("/emp")
public class EmployeeInfoController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of initBinder()

	@GetMapping("/loginPage")
	public String getForm() {
		return VIEW_LOGINPAGE;
	}// End of getForm()

	@PostMapping("/authernticate")
	public String login(EmployeeInfoBean bean, ModelMap modelMap, HttpServletRequest req) {

		String dbInstancetype = "hibernate";
		EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInstancetype);
		EmployeeInfoBean bean2 = dao.getEmployeeInfo(bean.getId());
		EmployeeOtherInfoBean otherInfoBean = dao.getEmployeeOtherInfo(bean.getId());

		if (bean2.getPassword().equals(bean.getPassword()) && bean2.getId() == bean.getId()) {
			HttpSession session = req.getSession(true); // creating session on successful authentication
			modelMap.addAttribute("bean", bean2);
			modelMap.addAttribute("otherInfoBean", otherInfoBean);
			return "loginmvc";
		} else {
			String msg = "Invalid password or User";
			modelMap.addAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
	}// End of submitForm2()

	@GetMapping("/create")
	public String getSubmitForm() {
		return "createemp";
	}// end of getSubmitForm()

	@PostMapping("/insdata")
	public String create(EmployeeInfoBean bean, ModelMap map) {
		String dbInstancetype = "hibernate";
		EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInstancetype);
		map.addAttribute("bean1", bean);
		boolean bean1 = dao.createEmployeeInfo(bean);

		if (bean1) {
			String msg = "account created login";
			map.addAttribute("msg", msg);
			return "loginPage";
		} else {
			String msg = "reg fail try again";
			map.addAttribute("msg", msg);
			return "createemp";
		}
	}// End of create()

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Successfully loggedout");
		return "loginPage";
	}// end of logout()

	@GetMapping("searchEmp")
	public String searchemp() {
		return "searchResult";
	}// end of searchemp()

	@GetMapping("/validate")
	public String validateSession(HttpServletRequest req, ModelMap modelMap, @RequestParam String url,
			@Value("${msg}") String msg) {
		if (req.getSession(false) == null) {
			modelMap.addAttribute("msg", msg);
			return "loginPage";
		}
		return "forward:/emp/" + url;
	}// end of validation()

	@GetMapping("/validate2/{url}")
	public String validateSession2(HttpServletRequest req, ModelMap modelMap, @PathVariable("url") String url,
			@Value("${msg}") String msg) {

		if (req.getSession(false) == null) {
			modelMap.addAttribute("msg", msg);
			return "loginPage";
		}
		String idv = req.getParameter("search");
		modelMap.addAttribute("idv", idv);
		return "forward:/emp/" + url;
	}// end of validation()

	public String validateSession4Post(HttpServletRequest req, ModelMap modelMap, @RequestParam String url,
			@Value("${msg}") String msg) {

		return validateSession(req, modelMap, url, msg);
	}// end of validateSession()

}
