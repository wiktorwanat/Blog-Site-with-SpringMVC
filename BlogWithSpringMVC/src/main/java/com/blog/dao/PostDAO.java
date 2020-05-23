package com.blog.dao;

import java.util.List;

import com.blog.entity.Post;

public interface PostDAO {

	
	public List<Post> getPosts();
	
	public void addPost(Post post);
	
	public Post getPost(int id);
	
	public void deletePost(int postId);


}
