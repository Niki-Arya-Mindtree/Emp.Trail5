package com.EmpTrail5.Exception;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustmExcep extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler()
	public final ResponseEntity<Object> handleNoException(Exception ex, WebRequest request)  {
		ExceptionStGtMet exsg= new ExceptionStGtMet( new Date(0) ,ex.getLocalizedMessage() );
		return new ResponseEntity(exsg,HttpStatus.BAD_REQUEST);
	}
	
}
