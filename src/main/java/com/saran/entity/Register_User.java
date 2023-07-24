package com.saran.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.saran.service.JwtService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Register_User")
public class Register_User {

//	@Autowired
//	JwtService jwtService;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(nullable = false, unique = true)
	private String userName;

	@Column(nullable = false)
	private String password;

	@Column
	private String token;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
//	public String createNewToken() {
//		return jwtService.generateToken(userName);
//	}

}
