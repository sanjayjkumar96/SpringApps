package com.shoponline.dreamThreads.exception;

public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 56853624584L;

	public ResourceNotFoundException() {
		super();
		
	}

	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ResourceNotFoundException(String message) {
		super(message);
		
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);
		
	}

	

	
}
