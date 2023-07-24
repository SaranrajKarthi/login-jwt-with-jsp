package com.saran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@GetMapping("/hi")
//	@ResponseBody
	public String index() {
		return "index";
	}
}
