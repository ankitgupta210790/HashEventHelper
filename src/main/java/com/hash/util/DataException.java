package com.hash.util;

public class DataException extends Exception {

	private static final long serialVersionUID = -3639730868810702430L;
	private String message;

	public DataException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
