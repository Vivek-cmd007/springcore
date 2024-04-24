package com.abc.mongodb.exception;

public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException() {
		
	}
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
