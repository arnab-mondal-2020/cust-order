package com.amdocs.custorder.datastore;

import java.util.Set;
import java.util.TreeSet;

import com.amdocs.custorder.model.CustomerOrder;

public class OrderData {
	public static final Set<CustomerOrder> CUSTOMER_ORDERS = new TreeSet<>();
}
