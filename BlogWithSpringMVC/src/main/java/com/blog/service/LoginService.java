package com.blog.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	private Logger logger=Logger.getLogger(LoginService.class);
	
	public boolean checkUserData(String login,String password) {
		logger.info("login : "+login+" password : "+password);
		return login.equals("root") && password.equals("root");
		}
	}

