package com.medicare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	public List<Users> findByCategory(String category);

}
