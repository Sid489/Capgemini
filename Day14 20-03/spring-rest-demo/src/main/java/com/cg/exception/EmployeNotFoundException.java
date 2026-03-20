package com.cg.exception;

public class EmployeNotFoundException extends RuntimeException {
	public EmployeNotFoundException(String msg) {
		super(msg);
	}
}
