package com.example.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examserver.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {
  
	User findByUserName(String userName);

}
