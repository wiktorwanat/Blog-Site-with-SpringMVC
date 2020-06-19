package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.UserDAO;
import com.blog.entity.User;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UserDAO userDAO;
	
	public void addUser(User user) {
		userDAO.addUser(user);
	}
	
	public User getUserByLogin(String login) {
		return userDAO.getUserByLogin(login);
	}
	public User getUserById(int userId) {
		return userDAO.getUserById(userId);
	}
	public boolean checkUserLoginData(String login,String password) {
		User checkUser=getUserByLogin(login);
		if(checkUser.getLogin().contentEquals(login)&&checkUser.getPassword().contentEquals(password)) {
				return true;
			}	
		
			return false;
	}
	
	public void deleteUser(int userId) {
		userDAO.deleteUser(userId);
	}
	public void deleteUser(String login) {
		userDAO.deleteUser(login);
	}
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}
	
}
