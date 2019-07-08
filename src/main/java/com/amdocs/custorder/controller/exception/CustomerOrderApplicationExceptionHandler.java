package com.amdocs.custorder.controller.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.amdocs.custorder.constants.CustomerOrderApplicationConstants;
import com.amdocs.custorder.exception.ApplicationException;
import com.amdocs.custorder.exception.CustomerNotFoundException;
import com.amdocs.custorder.exception.ItemNotFoundException;
import com.amdocs.custorder.exception.OrderNotFoundException;
import com.amdocs.custorder.model.ErrorObject;

@RestControllerAdvice
public class CustomerOrderApplicationExceptionHandler {

	@ExceptionHandler(value = { 
			CustomerNotFoundException.class, 
			ItemNotFoundException.class,
			OrderNotFoundException.class })
	public ResponseEntity<Object> handleApplicationException(ApplicationException e) {
		ErrorObject eo = new ErrorObject();
		eo.setErrorCode(e.getErrorCode());
		eo.setErrorMessage(e.getMessage());
		eo.setErrorTime(e.getErrorTime());

		return new ResponseEntity<>(eo, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleGenericException(Exception e) {
		ErrorObject eo = new ErrorObject();
		eo.setErrorCode(5000);
		eo.setErrorMessage(e.getMessage());
		eo.setErrorTime(CustomerOrderApplicationConstants.DATE_FORMATTER.format(new Date()));

		return new ResponseEntity<>(eo, HttpStatus.NOT_FOUND);
	}
}
