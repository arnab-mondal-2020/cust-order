package com.amdocs.custorder.model.builder;

import com.amdocs.custorder.model.Customer;

public class CustomerBuilder implements Builder<Customer> {
	private static final CustomerBuilder BUILDER = new CustomerBuilder();
	private Customer customer;

	private CustomerBuilder() {
	}

	public static CustomerBuilder newBuilder() {
		BUILDER.customer = new Customer();
		return BUILDER;
	}

	public CustomerBuilder withParameters(int customerId, String name) {
		withCustomerId(customerId);
		withName(name);
		return this;
	}

	public CustomerBuilder withName(String name) {
		customer.setCustName(name);
		return this;
	}

	public CustomerBuilder withCustomerId(int customerId) {
		customer.setCustId(customerId);
		return this;
	}

	@Override
	public Customer build() {
		return customer;
	}

}
