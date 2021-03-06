package com.github.youssfbr.aulajpa.controllers;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.github.youssfbr.aulajpa.controllers.interfaces.ICategoryController;
import com.github.youssfbr.aulajpa.dto.CategoryDTO;
import com.github.youssfbr.aulajpa.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController implements ICategoryController, Serializable {	
	private static final long serialVersionUID = 1L;
	
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

	@Override
	@PostMapping
	public ResponseEntity<CategoryDTO> insert(@RequestBody CategoryDTO dto) {
		
		dto = service.insert(dto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(dto);
	}

	@Override
	@PutMapping("/{id}")
	public ResponseEntity<CategoryDTO> update(
			@PathVariable Long id, 
			@RequestBody CategoryDTO dto) {
		
		dto = service.update(id, dto);	
		
		return ResponseEntity.ok(dto);
	}	

	@Override	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		
		service.delete(id);
		
		return ResponseEntity.noContent().build();
	}	
}
