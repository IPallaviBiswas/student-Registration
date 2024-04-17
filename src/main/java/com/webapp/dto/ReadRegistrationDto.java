package com.webapp.dto;

import java.util.List;

import com.webapp.entity.Registration;

public class ReadRegistrationDto {
	private List<Registration> registrations;//variable
	private String Message;//variable
	public List<Registration> getRegistrations() {
		return registrations;
	}
	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String Message) {
		this.Message = Message;
	}

}
