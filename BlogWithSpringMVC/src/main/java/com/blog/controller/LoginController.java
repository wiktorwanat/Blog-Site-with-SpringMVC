package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLoginPage() {
		return "loginsite";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLogin(ModelMap model,@RequestParam String userName) {
		model.put("username", userName);
		return "welcomesite";
	}

}
