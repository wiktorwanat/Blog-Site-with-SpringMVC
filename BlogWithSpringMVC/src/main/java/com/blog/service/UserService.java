package com.blog.service;

import com.blog.entity.User;

public interface UserService {
	
	public void addUser(User user);
	
	public User getUserByLogin(String login);
	
	public boolean checkUserLoginData(String login,String password);
	
	public void deleteUser(int userId);
	
	public User getUserById(int userId);
	
	public void updateUser(User user);
}
