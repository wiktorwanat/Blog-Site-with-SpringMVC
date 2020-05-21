package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLoginPage() {
		return "loginsite";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLogin(ModelMap model,@RequestParam String username,@RequestParam String userpassword) {
		if(loginService.checkUserData(username, userpassword)) {
			model.put("username", username);
			return "welcomesite";
		}else {
			model.put("wrongData", "Check your login and password ! ");
			return "loginsite";
		}
	}

}
