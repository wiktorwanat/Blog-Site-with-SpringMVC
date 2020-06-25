package com.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.blog.entity.User;
import com.blog.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String posts() {
		return "redirect:/posts";
	}
	
	@RequestMapping(value="/createaccount",method = RequestMethod.GET)
	public String showRegisterPage() {
		return "registrationpage";
	}
	
	@RequestMapping(value="/createaccount",method = RequestMethod.POST)
	public String createAccount(ModelMap model,@RequestParam String login,@RequestParam String password,@RequestParam String email) {
		userService.addUser(new User(login,password,email));
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login/accountsettings",method = RequestMethod.GET)
	public String showAccountSettings() {
		return "userSettings";
	}
	
	@RequestMapping(params="update",value="/login/accountsettings",method = RequestMethod.POST)
	public String updateAccountSettings(@RequestParam String login,@RequestParam String password,@RequestParam String email) {
		userService.updateUser(new User(login,password,email));
		return "redirect:/login";
	}
	
	@RequestMapping(params="delete",value="/login/accountsettings",method = RequestMethod.POST)
	public String deleteAccount(@RequestParam String login) {
		userService.deleteUser(login);
		return "redirect:/posts";
	}
	
}
