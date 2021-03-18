package com.github.youssfbr.aulajpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.youssfbr.aulajpa.entities.Product;
import com.github.youssfbr.aulajpa.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	private ProductService service;
	
	@Autowired
	public ProductController(ProductService service) {
		this.service = service;
	}
		
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {		
		return ResponseEntity.ok(service.findAll());
	}

}
