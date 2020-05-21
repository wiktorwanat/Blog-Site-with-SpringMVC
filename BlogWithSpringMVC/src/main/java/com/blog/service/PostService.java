package com.blog.service;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entity.Post;

@Service
public class PostService {
	private static List<Post> posts=new ArrayList<Post>();
	private int i=2;
	static {
		posts.add(new Post(1,"Pierwszy post","to jest tresc pierwszego testowego posta ,zeby zobaczyc czy to w ogole dziala",new Date(),123));
		posts.add(new Post(2,"drugbi post","to jest tresc drugiego testowego posta ,zeby zobaczyc czy to w ogole dziala",new Date(),124));
	}
	
	public void addPost(String title,String text,Date date,int authorid) {
		this.i+=1;
		posts.add(new Post(this.i,title,text,date,authorid));
	}
	
	public List<Post> findall(){
		List<Post> allPosts=new ArrayList<Post>();
		for(Post p:posts) {
			allPosts.add(p);
		}
		return allPosts;
	}
	public List<Post> findPostByAuthorId(int authorID){
		List<Post> userPosts=new ArrayList<Post>();
		for(Post p:posts) {
			if(p.getAuthorId()==authorID) {
				userPosts.add(p);
			}
		}
		return userPosts;
	}
}