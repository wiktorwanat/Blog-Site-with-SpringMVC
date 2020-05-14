package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

	@RequestMapping(value="/posts")
	@ResponseBody
	public String showPosts() {
		return "there will be a lot of posts";
	}
	
}
	

