package com.dreamchain.skeleton.web;

import com.dreamchain.skeleton.model.LoginBean;

public class LoginBeanCommand extends LoginBean{

	private Boolean selected = false;
	
	public LoginBeanCommand() {}

	public LoginBeanCommand(LoginBean user) {
		setUserName(user.getUserName());
		setPassword(user.getPassword());
		setRole(user.getRole());
		setMsg(user.getMsg());
	}

	public LoginBean toUser() {
		LoginBean user = new LoginBean();
		user.setUserName(getUserName());
		user.setPassword(getPassword());
		user.setRole(getRole());
		user.setMsg(getMsg());
		return user;
	}
	
	public Boolean getSelected() {
		return selected;
	}
	
	public void setSelected(Boolean changed) {
		this.selected = changed;
	}

}
