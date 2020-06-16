package com.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.entity.User;
import com.blog.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/createaccount",method = RequestMethod.GET)
	public String showRegisterPage() {
		return "registrationpage";
	}
	@RequestMapping(value="/createaccount",method = RequestMethod.POST)
	public String createAccount(ModelMap model,@RequestParam String login,@RequestParam String password,@RequestParam String email) {
		userService.addUser(new User(login,password,email));
		model.put("message","Account created succesfully!");
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login/accountsettings",method = RequestMethod.GET)
	public String showAccountSettings(ModelMap model) {
		return "userSettings";
	}
	@RequestMapping(value="/login/accountsettings",method = RequestMethod.POST)
	public String updateAccountSettings(ModelMap model,@RequestParam String login,@RequestParam String password,@RequestParam String email) {
		userService.updateUser(new User(login,password,email));
		return "redirect:/login";
	}
	
}
