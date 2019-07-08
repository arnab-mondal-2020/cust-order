package com.amdocs.custorder.model.builder;

import com.amdocs.custorder.model.Item;

public class ItemBuilder implements Builder<Item> {
	private static final ItemBuilder builder = new ItemBuilder();
	private Item item;

	private ItemBuilder() {
	}

	public static final ItemBuilder newBuilder() {
		builder.item = new Item();
		return builder;
	}

	public ItemBuilder withItemId(int itemId) {
		item.setItemId(itemId);
		return this;
	}

	public ItemBuilder withItemName(String itemName) {
		item.setItemName(itemName);
		return this;
	}

	public ItemBuilder withUnitPrice(double unitPrice) {
		item.setUnitPrice(unitPrice);
		return this;
	}

	public ItemBuilder withProperties(int itemId, String itemName, double unitPrice) {
		this.withItemId(itemId);
		this.withItemName(itemName);
		this.withUnitPrice(unitPrice);
		return this;
	}

	public void createListOf(Item item) {

	}

	@Override
	public Item build() {
		return item;
	}

}
