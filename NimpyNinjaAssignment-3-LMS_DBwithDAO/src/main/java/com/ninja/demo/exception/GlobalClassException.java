package com.ninja.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import io.micrometer.common.lang.Nullable;

@ControllerAdvice
public class GlobalClassException extends ResponseEntityExceptionHandler{
	
	HttpHeaders header = new HttpHeaders();
	
	
	@ExceptionHandler({LMSDataNotFound.class})
	
	@Nullable	
	public ResponseEntity<Object> handleGlobalException(Exception exception, WebRequest request)throws Exception{
		
		ErrorResponse errorResponse = null  ;
		
		if(exception instanceof LMSDataNotFound) {
			return handleExceptionInternal(exception, errorResponse, header, HttpStatus.NOT_FOUND, request);
		}
		
		else
			throw exception;

}
	
}
