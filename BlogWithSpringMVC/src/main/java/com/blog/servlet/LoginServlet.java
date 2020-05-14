package com.blog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.blog.service.LoginService;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	
	private LoginService loginService=new LoginService();
	private Logger logger=Logger.getLogger(LoginServlet.class);

	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/loginsite.jsp").forward(
				request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String userName=request.getParameter("username");
		String userPassword=request.getParameter("userpassword");
		logger.info(userName);
		logger.info(userPassword);
		boolean validData=loginService.checkUserData(userName, userPassword);
		logger.info(validData);
		if(validData) {		
			request.setAttribute("username", userName);
			request.getRequestDispatcher("/WEB-INF/views/welcomesite.jsp").forward(request,response);
		}else {
			request.setAttribute("wrongData","Check your Login or Password and try again");
				request.getRequestDispatcher("/WEB-INF/views/loginsite.jsp").forward(request,response);
		}
	}
}
		

