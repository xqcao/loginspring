package com.dreamchain.skeleton.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Null;

import org.junit.Ignore;

@Entity
@Table(name = "logintb")
public class LoginBean {
	@Id
	@Column(name="username")
	private String userName;
	
	private String password;
	private char role;
	
	@Null
	private String msg;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getRole() {
		return role;
	}
	public void setRole(char role) {
		this.role = role;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String Login(){
		return this.msg;
	}
	public String Logout(){
		return "Logout";
	}
}
