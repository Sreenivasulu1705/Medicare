package com.medicare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Users;
import com.medicare.repository.UsersRepository;
import com.medicare.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	
	@Autowired
	private UsersRepository usrRepository;
	
	@Override
	public Users createUsers(Users user) {
		
		return usrRepository.save(user);
	}

	@Override
	public List<Users> findByCategory(String category) {
		
		return usrRepository.findByCategory(category);
	}

	@Override
	public List<Users> getAllUsers() {
		
		return usrRepository.findAll();
	}

	

}
