package com.amdocs.custorder.model;

import java.io.Serializable;

public class Item implements Serializable, Comparable<Item> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4621573130456570081L;

	private int itemId;
	private String itemName;
	private double unitPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public int compareTo(Item o) {
		if(o == null) {
			return 1;
		}
		return Integer.compare(this.itemId, o.itemId);
	}

}
