package com.example.examserver.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name ="users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String userName;
  private String firstname;
  private String lastName;
  private String email;
  private String phone;
  private String password;
  private boolean enable=true;
  private String profile;
  //every user has many roles
  
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER , mappedBy="user" )
    @JsonIgnore
  Set<UserRole> userrole=new HashSet<>();
  
  public User() {
	  
  }
  
public User(long id,String password ,String profile, String userName, String firstName, String lastName, String email, String phone, boolean enable) {
	super();
	this.id = id;
	this.userName = userName;
	this.firstname = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.enable = enable;
	this.profile=profile;
	this.password=password;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Set<UserRole> getUserrole() {
	return userrole;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public void setUserrole(Set<UserRole> userrole) {
	this.userrole = userrole;
}

public long getId() {
	return id;
}


public String getProfile() {
	return profile;
}

public void setProfile(String profile) {
	this.profile = profile;
}

public void setId(long id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getFirstName() {
	return firstname;
}

public void setFirstName(String firstName) {
	this.firstname = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public boolean isEnable() {
	return enable;
}

public void setEnable(boolean enable) {
	this.enable = enable;
}

@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", firstname=" + firstname + ", lastName=" + lastName
			+ ", email=" + email + ", phone=" + phone + ", password=" + password + ", enable=" + enable + ", profile="
			+ profile + ", userrole=" + userrole + "]";
}


  
}

