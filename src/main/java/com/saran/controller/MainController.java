package com.saran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@GetMapping("/")
//	@ResponseBody
	public String register() {
		return "index";
	}
	@GetMapping("/login")
//	@ResponseBody
	public String login() {
		return "login";
	}
	@GetMapping("/register")
//	@ResponseBody
	public String redirect_Register() {
		return register();
	
	}
}
