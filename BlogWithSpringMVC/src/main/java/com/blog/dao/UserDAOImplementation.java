package com.blog.dao;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.blog.entity.User;

@Repository
@Transactional
public class UserDAOImplementation implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(user);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
	}
	
	@Override
	public User getUserByLogin(String login) {
		try {
			Criteria crit=sessionFactory.getCurrentSession().createCriteria(User.class);
			crit.add(Restrictions.eq("login",login));
			return (User)crit.list().get(0);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
		return null;
	}
	
	public User getUserById(int userId) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(User.class, userId);
	}
	
	@Override
	public void deleteUser(int userId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			User userToDelete=session.byId(User.class).load(userId);
			session.delete(userToDelete);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
	}
	
	@Override
	public void deleteUser(String login) {
		try {
			User user=getUserByLogin(login);
			Session session=sessionFactory.getCurrentSession();
			User managedUser=(User) session.merge(user);
			session.delete(managedUser);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
	}
	
	public void updateUser(User user) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(user);
		}catch(HibernateException exc) {
			exc.getMessage();
		}
	}

}
