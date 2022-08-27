package com.EmpTrail5.Exception;

import java.util.Date;

public class ExceptionStGtMet {
	
	private Date TimeStamp;
	private String message;
	
	
	public ExceptionStGtMet() {
		super();
	}
	public ExceptionStGtMet(Date timeStamp, String message) {
		super();
		TimeStamp = timeStamp;
		this.message = message;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
