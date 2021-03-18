package com.github.youssfbr.aulajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.youssfbr.aulajpa.entities.Product;
import com.github.youssfbr.aulajpa.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private final ProductRepository repository;
		
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> findAll() {
		return repository.findAll();
	}
}
