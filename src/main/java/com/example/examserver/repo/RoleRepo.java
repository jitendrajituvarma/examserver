package com.example.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examserver.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
