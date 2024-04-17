package com.webapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
//if you don't use this extends it will not become a special class that is capable of handling exception	
	
//ExceptionHandler class acts like a catch block, wherever exception occurs it will comes to this class and it will handle it	
	@ExceptionHandler(ResourceNotFoundException.class)//it can handle only ResourceNotFound Exception, other Exception it can't
	public ResponseEntity<?> resourceNotFound(
		ResourceNotFoundException e,	
		WebRequest webRequest){
		
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(Exception.class)//Exception.class can handle any exception
	public ResponseEntity<?> exceptionHandler(
		Exception e,	
		WebRequest webRequest){
		
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	
}
