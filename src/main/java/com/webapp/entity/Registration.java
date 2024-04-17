package com.webapp.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="registrations")//this annotation is used when the table name and class name is not same
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty
	@Size(min= 2 , message = "First Name should be atleat 2 characters")
	@Column(name = "first_name", length = 45)//when the column name and variable names are not same
	private String firstname;
	
	@Column(name = "last_name", length = 45)
	private String lastname;
	
	@Email
	@Column(name = "email", unique = true, length = 128)
	private String email;
	
	@Min(value = 1000000000, message = "Value must be at least 10")
	@Max(value = 9999999999L, message = "Mobile Number can't be more than 10 Digit")
	
	@Column(name = "mobile")
	private long mobile;
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
