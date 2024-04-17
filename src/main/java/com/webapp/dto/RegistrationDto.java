package com.webapp.dto;

public class RegistrationDto {
  
   private String firstname;
   
   private String email;
   private long mobile;
   
 //its not an entity class because there is no entity annotation, simply encapsulation class which is call POJO class
   
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}

   
   }
