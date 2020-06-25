package com.blog.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.entity.Post;
import com.blog.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	PostService postService;

	@RequestMapping(value="/posts",method = RequestMethod.GET)
	public String showAllPosts(ModelMap model) {
		model.addAttribute("posts",postService.getPosts());
		return "posts";
	}
	@RequestMapping(value="/posts/addpost",method=RequestMethod.GET)
	public String addPosts() {
		return "addpost";
		
	}
	
	@RequestMapping(value="/posts/addpost",method=RequestMethod.POST)
	public String addingPostsRedirectToPosts(ModelMap model,@RequestParam String title,@RequestParam String text) {
		Post addPost=new Post(123,title,text,(java.sql.Date) new Date(), 124);
		postService.addPost(addPost);
		return "redirect:/posts";
	}
	
	@RequestMapping(value="/posts/{userId}",method = RequestMethod.GET)
	public String showUserPosts(@PathVariable int userId,ModelMap model) {
		model.addAttribute("posts",postService.getUserPosts(userId));
		return "posts";
	}
	
}
	

