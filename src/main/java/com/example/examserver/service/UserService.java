package com.example.examserver.service;

import java.util.Set;

import com.example.examserver.entity.User;
import com.example.examserver.entity.UserRole;

public interface UserService {
   public User createUser(User user,Set<UserRole> userrole) throws Exception;
   public User getUser(String username);
   public void deleteUserById(Long id);
}
