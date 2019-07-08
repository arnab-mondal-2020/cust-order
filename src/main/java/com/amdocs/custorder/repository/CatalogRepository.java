package com.amdocs.custorder.repository;

import org.springframework.stereotype.Repository;

import com.amdocs.custorder.datastore.CatalogData;
import com.amdocs.custorder.model.Catalog;

@Repository
public class CatalogRepository {
	
	public Catalog displayAll() {
		return CatalogData.CATALOG;
	}
}
