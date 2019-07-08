package com.amdocs.custorder.datastore;

import java.util.Set;
import java.util.TreeSet;

import com.amdocs.custorder.model.Catalog;
import com.amdocs.custorder.model.Item;
import com.amdocs.custorder.model.builder.ItemBuilder;

public class CatalogData {
	public static final Catalog CATALOG = new Catalog();
	public static final Set<Item> ITEMS = new TreeSet<>();
	static {
		ITEMS.add(ItemBuilder.newBuilder().withProperties(1, "Apple iPhone X", 999.50).build());
		ITEMS.add(ItemBuilder.newBuilder().withProperties(2, "Google Pixel 3A XL", 850).build());
		ITEMS.add(ItemBuilder.newBuilder().withProperties(3, "Samsung Galaxy S9 Plus", 550).build());
		
		
		CATALOG.setItems(ITEMS);
	}
}
