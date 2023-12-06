package com.ninja.demo.exception;

public class LMSDataNotFound extends RuntimeException {
	
	public LMSDataNotFound() {
		super();
	}
	
	public LMSDataNotFound(String message,Throwable cause) {
		super(message, cause);
	}
	public LMSDataNotFound(String msg) {
		super(msg);
		
	}
	

}
