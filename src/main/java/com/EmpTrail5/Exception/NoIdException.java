package com.EmpTrail5.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.ACCEPTED)
public class NoIdException extends RuntimeException{
	public NoIdException(String message) {
		super(message);
	}
}
