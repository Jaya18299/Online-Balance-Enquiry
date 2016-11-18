package com.balance.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="Login_details")
public class Login
{
	@Id
	@Column (name="Login_username")
	private String username;
	@Column (name="Login_password")
	private String password;

	public  String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
