package com.amdocs.custorder.repository;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.springframework.stereotype.Repository;

import com.amdocs.custorder.datastore.CustomerData;
import com.amdocs.custorder.exception.CustomerNotFoundException;
import com.amdocs.custorder.model.Customer;

@Repository
public class CustomerRepository {
	public Customer createCustomer(Customer customer) {
		customer.setCustId(CustomerData.CUSTOMERS.size() + 1);
		CustomerData.CUSTOMERS.add(customer);
		return customer;
	}

	public Customer getCustomerById(int custId) {
		Predicate<Customer> findByIdPredicate = customer -> custId == customer.getCustId();
		Optional<Customer> searchResult = CustomerData.CUSTOMERS.stream().filter(findByIdPredicate).findFirst();
		if (searchResult.isPresent()) {
			return searchResult.get();
		}
		throw new CustomerNotFoundException("No customer found with id " + custId);
	}

	public Set<Customer> displayAllCustomers() {
		return CustomerData.CUSTOMERS;
	}
}
