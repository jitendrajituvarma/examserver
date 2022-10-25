package com.example.examserver.service.imp;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examserver.entity.User;
import com.example.examserver.entity.UserRole;
import com.example.examserver.repo.RoleRepo;
import com.example.examserver.repo.UserRepo;
import com.example.examserver.service.UserService;

@Service
public class UserServiceImp implements UserService {
     
	@Autowired
	 private UserRepo userRepo;
	@Autowired
	 private RoleRepo roleRepo;
	
	@Override
	public User createUser(User user, Set<UserRole> userrole) throws Exception {
		// TODO Auto-generated method stub
		User userLocal=this.userRepo.findByUserName(user.getUserName());
		if(userLocal !=null) {
			System.out.println("user is already exist");
			throw new Exception("user allready exist");
			
		}else {
			    for(UserRole r:userrole) { 
			    	roleRepo.save(r.getRole());
			    	
			    }
			    user.setUserrole(userrole);
			  //  user.getUserrole().addAll(userrole);
			    System.out.print(user);
			    try {
			    userLocal =this.userRepo.save(user);
			    }catch(Exception e) {
			    	
			    }
			
		}
		return userLocal;
	}

	@Override
	public User getUser(String username) {
		User user=this.userRepo.findByUserName(username);
		return user;
	}

	@Override
	public void deleteUserById(Long id) {
		if (this.roleRepo.existsById(id)) {
			this.roleRepo.deleteById(id);
		}
	
		
	}

}
