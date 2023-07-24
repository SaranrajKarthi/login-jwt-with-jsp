package com.saran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saran.entity.Register_User;
import com.saran.service.JwtService;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/hello")
	public String helloWorld() {
		return "HelloWorld";
	}
	
	@PostMapping("/authenticate")
	public String authenticateGetToken(@RequestBody Register_User authRequest) {
		
	Authentication authentication =	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(authRequest.getUserName());			
		}
		else {
			throw new UsernameNotFoundException("Invalid User!");
		}
		
	}
	
}
