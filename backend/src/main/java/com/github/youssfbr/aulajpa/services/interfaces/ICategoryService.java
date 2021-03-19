package com.github.youssfbr.aulajpa.services.interfaces;

import java.util.List;

import com.github.youssfbr.aulajpa.dto.CategoryDTO;

public interface ICategoryService {
	
	List<CategoryDTO> findAll();
	
	CategoryDTO findById(Long id);
	
	CategoryDTO insert(CategoryDTO dto);
	
	CategoryDTO update(Long id, CategoryDTO dto);
	
	void delete(Long id);
}
