package com.hash.model;

import com.hash.util.RESULT_CODE;

public class Result {

	private RESULT_CODE resultCode;

	private String message;

	public Result(RESULT_CODE resultCode, String message) {
		super();
		this.resultCode = resultCode;
		this.message = message;
	}

	public RESULT_CODE getResultCode() {
		return resultCode;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Result Code: " + resultCode + " Message: " + message;
	}

}