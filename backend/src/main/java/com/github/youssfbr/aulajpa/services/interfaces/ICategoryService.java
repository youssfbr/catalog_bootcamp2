package com.github.youssfbr.aulajpa.services.interfaces;

import java.util.List;

import com.github.youssfbr.aulajpa.dto.CategoryDTO;

public interface ICategoryService {
	
	public List<CategoryDTO> findAll();
	
	public CategoryDTO findById(Long id);
	
	public CategoryDTO insert(CategoryDTO dto);
}
