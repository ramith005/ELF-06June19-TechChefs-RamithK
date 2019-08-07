package com.tyss.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static com.tyss.emp.common.EMPCommons.*;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {

	@GetMapping("/validate/{url1}/{url2}")
	public String validate(HttpServletRequest req, ModelMap modelMap,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2,
			@Value("${InvalidSessionmsg}") String invalidSessionmsg) {
		if (req.getSession(false) == null) {
			modelMap.addAttribute("msg", invalidSessionmsg);
			return VIEW_LOGINPAGE;
		}
		return "forward:" + url1+"/"+url2;
	}// end of validation()
	
	public String validateSession4Post(HttpServletRequest req, ModelMap modelMap,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2,
			@Value("${InvalidSessionmsg}") String invalidSessionmsg) {

		return validate(req, modelMap, url1, url2, invalidSessionmsg);
	}// end of validateSession()

}
