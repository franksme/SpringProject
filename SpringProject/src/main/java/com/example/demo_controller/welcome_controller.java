package com.example.demo_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome_controller {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot";
				
		
	}
	
}
