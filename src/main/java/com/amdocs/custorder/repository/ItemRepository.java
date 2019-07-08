package com.amdocs.custorder.repository;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.springframework.stereotype.Repository;

import com.amdocs.custorder.datastore.CatalogData;
import com.amdocs.custorder.exception.CustomerNotFoundException;
import com.amdocs.custorder.model.Item;

@Repository
public class ItemRepository {
	
	public Item createItem(Item item) {
		item.setItemId(CatalogData.ITEMS.size() + 1);
		CatalogData.ITEMS.add(item);
		return item;
	}

	public Item getItemById(int itemId) {
		Predicate<Item> findByIdPredicate = item -> itemId == item.getItemId();
		Optional<Item> searchResult = CatalogData.ITEMS.stream().filter(findByIdPredicate).findFirst();
		if (searchResult.isPresent()) {
			return searchResult.get();
		}
		throw new CustomerNotFoundException("No item found with id " + itemId);
	}

	public Set<Item> displayAllItems() {
		return CatalogData.ITEMS;
	}
}
