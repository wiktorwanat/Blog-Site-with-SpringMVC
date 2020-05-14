package com.blog.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int postId;
	
	//@Column(unique=true)
	//@NotEmpty
	private String title;
	//@Column(length=20000)
	@Size(max=20000, message="Message cannot be longer than 20000 characters!")
	//@NotEmpty
	private String text;
	
	private int authorId;
	
	
	public Post() {System.out.println("enitity post");}
	
	public Post(int postId, String title, String text, int authorId) {
		super();
		this.postId = postId;
		this.title = title;
		this.text = text;
		this.authorId = authorId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	

}