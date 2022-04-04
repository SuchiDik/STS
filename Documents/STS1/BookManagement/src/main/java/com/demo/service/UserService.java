package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

public class UserService {
	
	@Autowired
	UserRepository userrepo;

	public User addUser(User user) {
	return userrepo.save(user);
	}

	public List<User> getUser() {
		
		return userrepo.findAll();
	}
}
