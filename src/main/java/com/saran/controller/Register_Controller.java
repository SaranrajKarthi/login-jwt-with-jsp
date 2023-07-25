package com.saran.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saran.entity.Register_User;
import com.saran.service.JwtService;
import com.saran.service.UserService;

@RestController
@RequestMapping("/api")
public class Register_Controller {
	@Autowired
	UserService userService;

	@Autowired
	JwtService jwtService;

//	 @GetMapping("/register")
//	    public String showRegisterForm(Model model) {
//	        model.addAttribute("registerUser", new Register_User());
//	        return "register_form";
//	    }
	
//	@GetMapping("/")
//	public String index() {
//		return "index";
//	}
//	
	
	
	
	@PostMapping("/register")
	public String addUser(@ModelAttribute Register_User reg_user, Model m) {
		Register_User userExist = userService.getUserByUsername(reg_user.getUserName());

		if (userExist != null) {
			m.addAttribute("errorMessage", "User is already exists");
			return "User Is Already Exists";
		}
		
		

		String token = jwtService.generateToken(reg_user.getUserName());
		reg_user.setToken(token);

		 reg_user.setUserName(reg_user.getUserName());
		    reg_user.setPassword(reg_user.getPassword());
		userService.saveOrUpdate(reg_user);

		return "Registered Successfully" + "redirectto:/login";

	}
	
//	  @GetMapping("/user")
//	    public ResponseEntity<?> getUserDetails(@RequestHeader("Authorization") String authorizationHeader) {
//	        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
//	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
//	        }
//
//	        String token = authorizationHeader.substring(7); // Remove "Bearer " from the token
//
//	        if (!jwtService.isTokenValid(token)) {
//	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
//	        }
//
//	        String username = jwtService.extractUsernameFromToken(token);
//	        Register_User user = userService.getUserByUsername(username);
//
//	        if (user == null) {
//	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
//	        }
//
//	        // Here, you can customize the response based on the user details fetched from the database
//	        Map<String, Object> userDetails = new HashMap<>();
//	        userDetails.put("userId", user.getUserId());
//	        userDetails.put("userName", user.getUserName());
//	        // Add any other user details you want to show
//
//	        return ResponseEntity.ok(userDetails);
//	    }
}
