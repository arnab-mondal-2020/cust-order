package com.amdocs.custorder.datastore;

import java.util.Set;
import java.util.TreeSet;

import com.amdocs.custorder.model.Customer;
import com.amdocs.custorder.model.builder.CustomerBuilder;

public class CustomerData {
	public static final Set<Customer> CUSTOMERS = new TreeSet<>();
	
	static {
		CUSTOMERS.add(CustomerBuilder.newBuilder()
				.withParameters(1, "Arnab M")
				.build());
		CUSTOMERS.add(CustomerBuilder.newBuilder()
				.withParameters(2, "Kane W")
				.build());
		CUSTOMERS.add(CustomerBuilder.newBuilder()
				.withParameters(3, "Jimmy A")
				.build());
		CUSTOMERS.add(CustomerBuilder.newBuilder()
				.withParameters(4, "Virat K")
				.build());
	}
}
