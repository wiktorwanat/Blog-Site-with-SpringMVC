package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="find_all_users",query="select u from User u")
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String login;
	private String password;
	private String email;
	@Column(name="posts")
	private Integer numberOfPosts;
	
	public User() {};
	public User( String login, String password, String email, Integer numberOfPosts) {
		super();

		this.login = login;
		this.password = password;
		this.email = email;
		this.numberOfPosts = numberOfPosts;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", login=" + login + ", password=" + password + ", email=" + email
				+ ", numberOfPosts=" + numberOfPosts + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
