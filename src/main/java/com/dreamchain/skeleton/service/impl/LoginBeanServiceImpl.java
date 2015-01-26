package com.dreamchain.skeleton.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamchain.skeleton.model.LoginBean;
import com.dreamchain.skeleton.service.LoginBeanService;

@Service
public class LoginBeanServiceImpl implements LoginBeanService{

	@Autowired 
	LoginBean loginBean;
	
	public String findpassword(String password) {
		// TODO Auto-generated method stub
		return loginBean.getUserName() +"    :     " +loginBean.getPassword();
	}

	@Override
	public String findByUsername(String username) {
		return loginBean.getPassword();
	}

}
