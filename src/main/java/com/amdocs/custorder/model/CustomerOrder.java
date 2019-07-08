package com.amdocs.custorder.model;

import java.io.Serializable;
import java.util.List;

public class CustomerOrder implements Serializable, Comparable<CustomerOrder> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2827747321907569142L;
	private int orderId;
	private List<Order> orders;
	private Customer customer;
	private double totalOrderPrice;
	private OrderStatus status;
	private String orderDate;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerOrder other = (CustomerOrder) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	@Override
	public int compareTo(CustomerOrder o) {
		if (o == null) {
			return 1;
		}
		return Integer.compare(this.orderId, o.orderId);
	}
}
