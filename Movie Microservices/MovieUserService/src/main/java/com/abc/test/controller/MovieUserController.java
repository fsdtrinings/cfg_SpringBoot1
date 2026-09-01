package com.abc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.test.entity.UserEntity;
import com.abc.test.service.UserService;

@RestController
@RequestMapping("/users/profile")
//@CrossOrigin(origins = "http://localhost:3000")
public class MovieUserController {

	@Autowired
	UserService userService;

	public MovieUserController(UserService userService) {
	        this.userService = userService;
	    }

	@PostMapping
	public UserEntity addUser(@RequestBody UserEntity user) {

		return userService.addUser(user);
	}
	
	@PostMapping("/login")
	public UserEntity getUser(@RequestParam long phone,String pass)
	{
		UserEntity user = userService.getUserByPhoneAndPassword(phone, pass);
		if(user!=null) return user;
		else throw new RuntimeException("User not found "+phone+" & "+pass);
	}
	
	@GetMapping("/search/{phone}")
	public UserEntity getUserByPhone(@PathVariable long phone)
	{
		return userService.getUserById(phone);
	}
}