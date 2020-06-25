package com.blog.service;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.Post;


public interface PostService {
	
	public List<Post> getPosts();
	
	public List<Post> getUserPosts(int userId);
	
	public void addPost(Post post);
	
	public Post getPost(int id);
	
	public void deletePost(int postId);

}