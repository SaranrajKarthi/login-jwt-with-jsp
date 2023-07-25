package com.saran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saran.entity.Register_User;
import com.saran.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

	@PostMapping("/userlogin")
	public String userLogin(@RequestParam("userName") String uname, @RequestParam("password") String password, HttpSession session, Model m) {
		Register_User user = userService.getUserByUsername(uname);

		if (user != null && user.getPassword().equals(password)) {
			session.setAttribute("loggedInUser", user);
			return "redirect:/dashboard";
		} else {
			m.addAttribute("errorMessage", "Invalid credentials. Please try again.");
			return "redirect:/login";
		}
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
}
