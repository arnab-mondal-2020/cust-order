package com.amdocs.custorder.model;

import java.io.Serializable;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5080351116750247881L;

	private Item orderedItem;
	private int unitsOrdered;

	public Item getOrderedItem() {
		return orderedItem;
	}

	public void setOrderedItem(Item orderedItem) {
		this.orderedItem = orderedItem;
	}

	public int getUnitsOrdered() {
		return unitsOrdered;
	}

	public void setUnitsOrdered(int unitsOrdered) {
		this.unitsOrdered = unitsOrdered;
	}

}
