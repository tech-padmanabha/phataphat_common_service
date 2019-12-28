package com.phataphat.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ApiResponse {
	//Response Code
	private String code;
	//Response date and time 
	private String date;
	//Generally response about nature and error info
	private String message;
	//Response Data
	private Object data;
	public ApiResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
		this.date = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
	public ApiResponse(String code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
		this.date = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
	}
	
	public ApiResponse() {
		super();
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	
	public String getDate() {
		return date;
	}
	
	public Object getData() {
		return data;
	}
}
