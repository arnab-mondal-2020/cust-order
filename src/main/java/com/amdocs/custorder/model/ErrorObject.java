package com.amdocs.custorder.model;

import java.io.Serializable;

public class ErrorObject implements Serializable {

	private static final long serialVersionUID = 4695125229275524937L;

	private String errorMessage;
	private int errorCode;
	private String errorTime;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(String errorTime) {
		this.errorTime = errorTime;
	}

}
