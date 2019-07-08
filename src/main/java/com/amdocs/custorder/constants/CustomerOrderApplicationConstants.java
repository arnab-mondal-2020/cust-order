package com.amdocs.custorder.constants;

import java.text.SimpleDateFormat;

public interface CustomerOrderApplicationConstants {
	String DATE_FORMAT = "dd-MMM-yyyy '@' HH:mm:ss";
	SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);
	
	int CUSTOMER_NOT_FOUND = 1000;
	int ITEM_NOT_FOUND = 2000;
	int ORDER_NOT_FOUND = 3000;
}
