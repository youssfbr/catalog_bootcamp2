package com.github.youssfbr.aulajpa.controllers.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.github.youssfbr.aulajpa.dto.CategoryDTO;

public interface ICategoryController {

	ResponseEntity<List<CategoryDTO>> findAll();
	
	ResponseEntity<CategoryDTO> findById(Long id);
	
	ResponseEntity<CategoryDTO> insert(CategoryDTO dto);
	
	ResponseEntity<CategoryDTO> update(Long id, CategoryDTO dto);

	ResponseEntity<Void> delete(Long id); 
}

