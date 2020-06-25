package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.blog.entity.User;
import com.blog.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLoginPage() {
		return "loginsite";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLogin(ModelMap model,@RequestParam String login,@RequestParam String password) {
		if(userService.checkUserLoginData(login, password)==true) {
			userService.getUserByLogin(login);
			return "welcomesite";
		}else {
			model.put("message", "Check your login and password ! ");
			return "loginsite";
		}
	}
}
