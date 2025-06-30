package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	
	@GetMapping("/welcome/{name}")
	public String welcomeMessage(@PathVariable String name) {
		
		return "Welcome "+name ;
	}

}
