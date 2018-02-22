package com.niit.model;

 
 import java.io.Serializable;

import javax.persistence.Entity;
 import javax.persistence.Id;

 import org.springframework.stereotype.Component;

 @SuppressWarnings("serial")
@Component
 @Entity 
 public class User implements Serializable {
 	
 	@Id
 	private String username;
 	private String password;
 	private String name;
 	private String contact;
 	private String email;
 	private String gender;
 	private String address;
 	private String role;
 	private boolean enabled;  
 
 	public String getUsername() {
 		return username;
 	}
 	public void setUsername(String username) {
 		this.username = username;
 	}
 	public String getPassword() {
 		return password;
 	}
 	public void setPassword(String password) {
 		this.password = password;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	public String getContact() {
 		return contact;
 	}
 	public void setContact(String contact) {
 		this.contact = contact;
 	}
 	public String getEmail() {
 		return email;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}
 	public String getGender() {
 		return gender;
 	}
 	public void setGender(String gender) {
 		this.gender = gender;
 	}
 	public String getAddress() {
 		return address;
 	}
 	public void setAddress(String address) {
 		this.address = address;
 	}
 	public String getRole() {
 		return role;
 	}
 	public void setRole(String role) {
 		this.role = role;
 	}
 	public boolean isEnabled() {
 		return enabled;
 	}
 	public void setEnabled(boolean enabled) {
 		this.enabled = enabled;
 	}
 	@Override
 	public String toString() {
 		return "User [username=" + username + ", password=" + password + ", name=" + name + ", contact=" + contact
 				+ ", email=" + email + ", gender=" + gender + ", address=" + address + ", role=" + role + ", enabled="
 				+ enabled + "]";
 	}
 	
 }
