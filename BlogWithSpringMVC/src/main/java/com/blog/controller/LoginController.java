package com.blog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.dao.UserDAO;
import com.blog.entity.User;
import com.blog.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService UserService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLoginPage() {
		return "loginsite";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLogin(ModelMap model,@RequestParam String login,@RequestParam String password) {
		if(UserService.checkUserLoginData(login, password)==true) {
			User user=UserService.getUserByLogin(login);
			model.addAttribute(user);
			return "welcomesite";
		}else {
			model.put("message", "Check your login and password ! ");
			return "loginsite";
		}
	}

}
