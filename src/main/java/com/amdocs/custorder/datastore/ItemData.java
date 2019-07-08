package com.amdocs.custorder.datastore;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.custorder.model.Item;

public class ItemData {
	public static final List<Item> ITEMS = new ArrayList<>();
	
	static {
		Item item = new Item();
		item.setItemId(1);
		item.setItemName("iPhone X");
		item.setUnitPrice(1000.5);
		ITEMS.add(item);
		
		item = new Item();
		item.setItemId(1);
		item.setItemName("Google Pixel");
		item.setUnitPrice(950);
		ITEMS.add(item);
		
		item = new Item();
		item.setItemId(1);
		item.setItemName("Samsumg Galaxy Note");
		item.setUnitPrice(850);
		ITEMS.add(item);
	}
	
	
}
