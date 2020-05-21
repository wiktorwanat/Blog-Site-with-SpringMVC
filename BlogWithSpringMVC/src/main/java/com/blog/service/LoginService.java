package com.blog.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	private Logger logger=Logger.getLogger(LoginService.class);
	
	public boolean checkUserData(String userLogin,String userPassword) {
		logger.info("login : "+userLogin+" password : "+userPassword);
		return userLogin.equals("root") && userPassword.equals("root");
		}
	}

