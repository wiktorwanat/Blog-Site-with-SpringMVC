package com.blog.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int postId;
	
	@Column(unique=true)
	private String title;
	
	@Size(max=20000, message="Message cannot be longer than 20000 characters!")
	private String text;
	private Date postDate;
	private int authorId;
	
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
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public Post() {}
	
	public Post(int postId, String title, String text, Date postDate, int authorId) {
		super();
		this.postId = postId;
		this.title = title;
		this.text = text;
		this.postDate = postDate;
		this.authorId = authorId;
	}
	
	@Override
	public String toString() {
		return String.format("Post [postId=%s, title=%s, text=%s, postDate=%s, authorId=%s]", postId, title, text,
				postDate, authorId);
	}
}