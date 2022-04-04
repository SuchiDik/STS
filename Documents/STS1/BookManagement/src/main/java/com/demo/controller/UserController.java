package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.demo.entity.User;
import com.demo.service.UserService;

public class UserController {
	
		@Autowired
	UserService userservice;
	
	@GetMapping("/new")
	public String showForm(Model model) {
		
		model.addAttribute("user", new User());
		
		return "new";
	}
	
	
@PostMapping("/addUser")
public User addUser(User user) {
	return userservice.addUser(user);
	
	}
	
}
