package com.amdocs.custorder.model;

import java.io.Serializable;
import java.util.Set;

public class Catalog implements Serializable {

	private static final long serialVersionUID = 6050810369941732871L;
	private Set<Item> items;

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
}
