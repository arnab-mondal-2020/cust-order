package com.amdocs.custorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.custorder.model.Customer;
import com.amdocs.custorder.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository repository;

	@PostMapping(value = "/customer/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> createOrder(@RequestBody Customer customer) {
		return new ResponseEntity<>(repository.createCustomer(customer), HttpStatus.CREATED);
	}

	@GetMapping(value = "/customer/{customerId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getOrderById(@PathVariable("customerId") int customerId) {
		return new ResponseEntity<>(repository.getCustomerById(customerId), HttpStatus.OK);
	}

	@GetMapping(value = "/customer/all", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> displayAll() {
		return new ResponseEntity<>(repository.displayAllCustomers(), HttpStatus.OK);
	}

}
