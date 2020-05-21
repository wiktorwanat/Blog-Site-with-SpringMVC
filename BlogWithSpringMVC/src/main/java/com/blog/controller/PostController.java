package com.blog.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	PostService postService;

	@RequestMapping(value="/posts",method = RequestMethod.GET)
	public String showAllPosts(ModelMap model) {
		model.addAttribute("posts",postService.findall());
		return "posts";
	}
	@RequestMapping(value="/posts/addpost",method=RequestMethod.GET)
	public String addPosts() {
		return "addpost";
		
	}
	@RequestMapping(value="/posts/addpost",method=RequestMethod.POST)
	public String addingPostsRedirectToPosts(ModelMap model,@RequestParam String title,@RequestParam String text) {
		postService.addPost(title, text, new Date(), 124);
		return "redirect:/posts";
	}
//	@RequestMapping(value="/posts/{username}",method = RequestMethod.GET)
//	public String showUserPosts(@PathVariable("uModelMap model) {
//		model.addAttribute("posts",postService.findall());
//		return "posts";
//	}
}
	

