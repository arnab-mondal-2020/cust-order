package com.amdocs.custorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.custorder.model.Catalog;
import com.amdocs.custorder.repository.CatalogRepository;

@RestController
public class CatalogController {
	@Autowired
	private CatalogRepository repository;

	@GetMapping(value = "/catalog/displayall", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Catalog> displayCatalog() {
		return new ResponseEntity<>(repository.displayAll(), HttpStatus.OK);
	}
}
