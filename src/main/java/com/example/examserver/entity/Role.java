package com.example.examserver.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="roles")
public class Role {
	
	@Id
	private long roleId;
	private String roleName;
	
	@OneToMany( cascade = CascadeType.ALL ,fetch = FetchType.LAZY , mappedBy = "role")
	Set<UserRole> userrole=new HashSet<>();
	
	public Role() {
		super();
	}
	
	public Role(long roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	


}
