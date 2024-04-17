package com.webapp.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String message) {//constructor
		super(message);
	}

}
