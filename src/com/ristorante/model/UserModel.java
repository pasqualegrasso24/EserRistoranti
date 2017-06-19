package com.ristorante.model;

public class UserModel {
	private String username,password,privilegi;
	
	public UserModel(){};

	public UserModel(String username, String password, String privilegi) {
		
		this.username = username;
		this.password = password;
		this.privilegi = privilegi;
	}

	public String getUsername() {
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

	public String getPrivilegi() {
		return privilegi;
	}

	public void setPrivilegi(String privilegi) {
		this.privilegi = privilegi;
	}
	
	
	

}
