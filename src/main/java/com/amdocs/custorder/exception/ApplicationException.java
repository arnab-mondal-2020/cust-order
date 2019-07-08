package com.amdocs.custorder.exception;

public interface ApplicationException {
	String getMessage();
	String getErrorTime();
	int getErrorCode();
}
