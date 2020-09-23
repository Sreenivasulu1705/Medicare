package com.medicare.service;

import java.util.List;

import com.medicare.model.Users;

public interface UsersService {

	List<Users> findByCategory(String category);

	public Users createUsers(Users user);
	
	List<Users> getAllUsers();



}
