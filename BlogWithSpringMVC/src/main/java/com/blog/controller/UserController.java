package com.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/createaccount",method = RequestMethod.GET)
	public String showRegisterPage() {
		return "registrationpage";
	}
	@RequestMapping(value="/createaccount",method = RequestMethod.POST)
	public String createAccount(ModelMap model,@RequestParam String login,@RequestParam String password,@RequestParam String email) {
		//function from service will be there , first need to create datebase and connection with DB
		model.put("message","Account created succesfully!");
		return "redirect:/login";
	}
	
}
