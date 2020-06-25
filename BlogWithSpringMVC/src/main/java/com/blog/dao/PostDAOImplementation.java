package com.blog.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.blog.entity.Post;

@Repository
@Transactional
public class PostDAOImplementation implements PostDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Post> getPosts(){
		try {
		    Session session = sessionFactory.getCurrentSession();
		    CriteriaBuilder cb = session.getCriteriaBuilder();
		    CriteriaQuery < Post > cq = cb.createQuery(Post.class);
		    Root < Post > root = cq.from(Post.class);
		    cq.select(root);
		    Query query = session.createQuery(cq);
		    return query.getResultList();
		}catch(HibernateException exc) {
			exc.getMessage();
		}
		return null;
	}
	
	@Override
	public void addPost(Post post) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(post);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
}
	
	@Override
	public Post getPost(int id) {
		try {
			Session session = sessionFactory.getCurrentSession();
			Post postToFind=session.get(Post.class, id);
			return postToFind;
		}catch(HibernateException exc) {
			exc.getMessage();
		}
		return null;
	}
	
	@Override
	public void deletePost(int postId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Post postToDelete=session.byId(Post.class).load(postId);
			session.delete(postToDelete);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
	}
}
