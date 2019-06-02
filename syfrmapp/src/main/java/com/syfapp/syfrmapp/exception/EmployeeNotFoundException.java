package com.syfapp.syfrmapp.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 56853624584L;

	public EmployeeNotFoundException() {
		super();
		
	}

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EmployeeNotFoundException(String message) {
		super(message);
		
	}

	public EmployeeNotFoundException(Throwable cause) {
		super(cause);
		
	}
}
