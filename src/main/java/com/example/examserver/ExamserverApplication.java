package com.example.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.examserver.entity.Role;
import com.example.examserver.entity.User;
import com.example.examserver.entity.UserRole;
import com.example.examserver.service.imp.UserServiceImp;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	 @Autowired
	 UserServiceImp imp;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
