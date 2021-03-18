package com.github.youssfbr.aulajpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.youssfbr.aulajpa.entities.Category;
import com.github.youssfbr.aulajpa.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	
	private CategoryService service;
	
	@Autowired
	public CategoryController(CategoryService service) {
		this.service = service;
	}
		
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {		
		return ResponseEntity.ok(service.findAll());
	}

}
