package com.techchefs.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.springmvctest.model.MyName;

@Controller
@RequestMapping("/myspring")
public class NameController {

	@GetMapping("/getpage")
	public String getPage() {
		
		return "view1";
	}
	
	@GetMapping("/fetchName")
	public String fetchName(ModelMap modelMap) {
		//Initialize the Model
		MyName myname = new MyName();
		modelMap.addAttribute("msg", myname.getMyName());
		return "view2";
	}
}
