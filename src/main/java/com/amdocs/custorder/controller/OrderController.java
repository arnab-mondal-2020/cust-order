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

import com.amdocs.custorder.model.CustomerOrder;
import com.amdocs.custorder.repository.OrderRepository;

@RestController
public class OrderController {
	@Autowired
	private OrderRepository repository;

	@PostMapping(value = "/orders/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> createOrder(@RequestBody CustomerOrder customerOrder) {
		return new ResponseEntity<>(repository.createOrder(customerOrder), HttpStatus.CREATED);
	}

	@GetMapping(value = "/orders/{orderId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getOrderById(@PathVariable("orderId") int orderId) {
		return new ResponseEntity<>(repository.getOrderById(orderId), HttpStatus.OK);
	}

	@GetMapping(value = "/orders/customer/{custId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getOrderByCustomerId(@PathVariable("custId") int custId) {
		return new ResponseEntity<>(repository.getOrderByCustomerId(custId), HttpStatus.OK);
	}
	
	@GetMapping(value = "/orders/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getAllOrders() {
		return new ResponseEntity<>(repository.getAllOrders(), HttpStatus.OK);
	}
}
