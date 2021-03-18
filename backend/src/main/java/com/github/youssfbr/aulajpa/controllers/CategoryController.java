package com.github.youssfbr.aulajpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.youssfbr.aulajpa.controllers.interfaces.ICategoryController;
import com.github.youssfbr.aulajpa.dto.CategoryDTO;
import com.github.youssfbr.aulajpa.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController implements ICategoryController {
	
	private CategoryService service;
	
	@Autowired
	public CategoryController(CategoryService service) {
		this.service = service;
	}
	
	@Override
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll() {		
		return ResponseEntity.ok(service.findAll());
	}

	@Override
	@GetMapping("/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
		
		CategoryDTO dto = service.findById(id);
		
		return ResponseEntity.ok(dto);
	}
}
