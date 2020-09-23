package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Users;
import com.medicare.service.UsersService;


@RestController
public class UsersController {

	@Autowired
	private UsersService usService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/category/{user}")
	public List<Users> findByCategory(@PathVariable("user")String category) {
		
		return usService.findByCategory(category);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/users")
	public Users createUsers(@RequestBody Users user) {
		
		return usService.createUsers(user);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getUsers")
    public List<Users> getAllUsers() {
		
		return usService.getAllUsers();
	}


}
