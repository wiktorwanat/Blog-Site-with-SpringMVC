package com.blog.service;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.PostDAO;
import com.blog.entity.Post;

@Service
public class PostServiceImplementation implements PostService{
	
	@Autowired
	private PostDAO postDAO;
	
	public List<Post> getPosts(){
		return postDAO.getPosts();
	}
	
	public void addPost(Post post) {
		postDAO.addPost(post);
	}
	
	public Post getPost(int id) {
		return postDAO.getPost(id);
	};
	
	public void deletePost(int postId) {
		postDAO.deletePost(postId);
	}

	@Override
	public List<Post> getUserPosts(int userId) {
		List<Post> allPosts=postDAO.getPosts();
		List<Post> userPosts=new ArrayList();
		for(Post p:allPosts) {
			if(p.getAuthorId()==userId) {
				userPosts.add(p);
			}
		}
		return userPosts;
	};

}