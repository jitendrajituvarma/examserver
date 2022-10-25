package com.example.examserver.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examserver.entity.Role;
import com.example.examserver.entity.User;
import com.example.examserver.entity.UserRole;
import com.example.examserver.service.imp.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceImp imp;
	
	@PostMapping("/")
   public User createUser(@RequestBody User user) throws Exception {
		Role role=new Role();
		role.setRoleId(23L);
		role.setRoleName("ADMIN");
		
		UserRole userrole=new UserRole();
		userrole.setUser(user);
		userrole.setRole(role);
		
		
	   Set<UserRole> roles=new HashSet<>();
	   roles.add(userrole);
	   
	  User u=imp.createUser(user, roles);
	  return u;
	   
   }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
    	User user=imp.getUser(username);
    	return user;
	   
   }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
    	imp.deleteUserById(id);
    }
}
