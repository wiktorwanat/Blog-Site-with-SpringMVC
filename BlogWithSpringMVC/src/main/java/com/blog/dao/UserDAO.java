package com.blog.dao;

import java.util.List;

import com.blog.entity.Post;
import com.blog.entity.User;

public interface UserDAO {

	public void addUser(User user);
	
	public User getUserByLogin(String login);
	
	public void deleteUser(int userId);
	
	public User getUserById(int userId);
	
	public void updateUser(User user);
}
