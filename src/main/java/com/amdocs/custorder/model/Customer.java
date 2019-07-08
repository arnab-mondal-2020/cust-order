package com.amdocs.custorder.model;

import java.io.Serializable;

public class Customer implements Serializable, Comparable<Customer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1600725525853587564L;

	private int custId;
	private String custName;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public int compareTo(Customer o) {
		if (o == null) {
			return 1;
		}
		return Integer.compare(this.custId, o.custId);
	}

}
