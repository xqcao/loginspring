package com.dreamchain.skeleton.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dreamchain.skeleton.dao.LoginBeanDao;
import com.dreamchain.skeleton.model.LoginBean;

@Repository
public class LoginBeanDaoImpl implements LoginBeanDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String findpassword(String password) {
		LoginBean loginBean = (LoginBean)sessionFactory.getCurrentSession().createQuery("from logintb u where u.password = :password").setString("password", password).uniqueResult();
		return loginBean.getUserName()+"    :    "+loginBean.getPassword();
	}

	@Override
	public String findByUsername(String username) {	
		LoginBean loginBean = (LoginBean)sessionFactory.getCurrentSession().createQuery("from logintb u where u.name = :username").setString("username", username).uniqueResult();
		return loginBean.getPassword();
	}
}
