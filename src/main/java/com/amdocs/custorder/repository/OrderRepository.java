package com.amdocs.custorder.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.custorder.constants.CustomerOrderApplicationConstants;
import com.amdocs.custorder.datastore.OrderData;
import com.amdocs.custorder.exception.OrderNotFoundException;
import com.amdocs.custorder.model.Customer;
import com.amdocs.custorder.model.CustomerOrder;
import com.amdocs.custorder.model.Order;
import com.amdocs.custorder.model.OrderStatus;

@Repository
public class OrderRepository {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	public CustomerOrder createOrder(CustomerOrder customerOrder) {
		customerOrder.setOrderId(OrderData.CUSTOMER_ORDERS.size() + 1);

		Customer customer = customerRepository.getCustomerById(customerOrder.getCustomer().getCustId());
		customerOrder.setCustomer(customer);

		for (Order order : customerOrder.getOrders()) {
			order.setOrderedItem(itemRepository.getItemById(order.getOrderedItem().getItemId()));
		}
		
		customerOrder.setTotalOrderPrice(getTotalOrderPrice(customerOrder.getOrders()));
		
		customerOrder.setStatus(OrderStatus.CREATED);
		
		customerOrder.setOrderDate(CustomerOrderApplicationConstants.DATE_FORMATTER.format(new Date()));
		
		OrderData.CUSTOMER_ORDERS.add(customerOrder);
		return customerOrder;
	}

	public CustomerOrder getOrderById(int orderId) {
		Optional<CustomerOrder> search = OrderData.CUSTOMER_ORDERS.stream()
				.filter(order -> order.getOrderId() == orderId).findFirst();
		if (search.isPresent()) {
			return search.get();
		}
		throw new OrderNotFoundException("No order found with id " + orderId);
	}

	public CustomerOrder getOrderByCustomerId(int custId) {
		Optional<CustomerOrder> search = OrderData.CUSTOMER_ORDERS.stream()
				.filter(order -> order.getCustomer().getCustId() == custId).findFirst();
		if (search.isPresent()) {
			return search.get();
		}
		throw new OrderNotFoundException("No order found with customer id " + custId);
	}

	public Set<CustomerOrder> getAllOrders() {
		return OrderData.CUSTOMER_ORDERS;
	}

	private double getTotalOrderPrice(List<Order> orders) {
		return orders.stream().mapToDouble(order -> 
					(order.getOrderedItem().getUnitPrice() * order.getUnitsOrdered()))
					.sum();
	}
}
