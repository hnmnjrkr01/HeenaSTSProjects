package com.ninja.demo.exception;

public class DataNotFound extends RuntimeException {
	
	
	public DataNotFound(String message,Throwable cause) {
		super(message, cause);
	}
	public DataNotFound(String msg) {
		super(msg);
		
	}
	

}
