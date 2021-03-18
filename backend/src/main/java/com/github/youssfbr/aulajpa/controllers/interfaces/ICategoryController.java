package com.github.youssfbr.aulajpa.controllers.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.github.youssfbr.aulajpa.dto.CategoryDTO;

public interface ICategoryController {

	public ResponseEntity<List<CategoryDTO>> findAll();
	
	public ResponseEntity<CategoryDTO> findById(Long id);
	
	public ResponseEntity<CategoryDTO> insert(CategoryDTO dto);
}

