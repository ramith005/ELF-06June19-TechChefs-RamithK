package com.tyss.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormController {

	@RequestMapping("/getForm")
	public String getForm() {
		return "myform";
	}// End of getForm()

	@PostMapping("/formSubmit")
	public String submit(HttpServletRequest req) {

		int userId = Integer.parseInt(req.getParameter("userId"));
		String password = req.getParameter("password");

		req.setAttribute("userId", userId);
		req.setAttribute("password", password);

		return "formdataDisplay";
	}// End of submit()

	@PostMapping("/formSubmit2")
	public String submitForm2(int userId, String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);

		return "formdataDisplay";
	}// End of submitForm2()

	@PostMapping("/formSubmit3")
	public String submitForm3(UserBean bean, ModelMap map) {
		map.addAttribute("userBean", bean);
		return "formdataBeanDisplay";
	}// End of submitForm3()

	@PostMapping("/formSubmit4")
	public String submit4(@RequestParam(name = "userId") int uid, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {

		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);

		return "formdataBeanDisplay";
	}

	@PostMapping("/formSubmit5")
	public String submit5(@RequestParam(name = "userId") int uid, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {

		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);

		return "formdataDisplayEL";
	}

	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean bean, ModelMap map) {
		map.addAttribute("userBean", bean);
		return "formdataBeanDisplayEL";
	}// End of submitForm3()

}
