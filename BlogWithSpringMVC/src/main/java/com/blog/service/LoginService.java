package com.blog.service;

import org.apache.log4j.Logger;

import com.blog.servlet.LoginServlet;

public class LoginService {
	
	private Logger logger=Logger.getLogger(LoginServlet.class);
	
	public boolean checkUserData(String userLogin,String userPassword) {
		logger.info(userLogin+" haslo to "+userPassword);
		return userLogin.equals("root") && userPassword.equals("root");
		}
	}

