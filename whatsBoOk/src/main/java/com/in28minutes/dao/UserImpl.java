package com.in28minutes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.user.User;
@Repository
public class UserImpl {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public void addUser(User user) {
		Session ses=sessionFactory.getCurrentSession();
		System.out.println(ses);
	   ses.save(user);
	   sessionFactory.close();
	   ses.close();
   
	}

}
