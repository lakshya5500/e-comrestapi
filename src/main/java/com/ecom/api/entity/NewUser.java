package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewUser {
	
		
	String name;
	String username;
	@Id
	String email;
	String password;
	public NewUser() {
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public NewUser(String name, String username, String email, String password) {
		super();
		
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
}
