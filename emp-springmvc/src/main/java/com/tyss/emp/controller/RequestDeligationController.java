package com.tyss.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class RequestDeligationController {

	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "homePage";
	}// End of getHomePage()

	@GetMapping("/forwardReq")
	public String forwardReq() {
		return "forward:/forms/getForm";
	}// end of fowardReq()

	@GetMapping("/redirectReq")
	public String redirectReq() {
		return "redirect:https://www.google.com";
	}// End of redirectReq()

}// End of controller
