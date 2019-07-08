package com.amdocs.custorder.exception;

import java.util.Date;

import com.amdocs.custorder.constants.CustomerOrderApplicationConstants;

public class OrderNotFoundException extends RuntimeException implements ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8236930258844153403L;
	
	private int errorCode;
	private String errorTime;

	public OrderNotFoundException(String message) {
		super(message);
		this.errorCode = CustomerOrderApplicationConstants.ORDER_NOT_FOUND;
		this.errorTime = CustomerOrderApplicationConstants.DATE_FORMATTER.format(new Date());
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorTime() {
		return errorTime;
	}
}
