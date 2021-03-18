package com.github.youssfbr.aulajpa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.youssfbr.aulajpa.dto.CategoryDTO;
import com.github.youssfbr.aulajpa.entities.Category;
import com.github.youssfbr.aulajpa.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private final CategoryRepository repository;
		
	public CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();
				
		return list.stream().map(x-> new CategoryDTO(x)).collect(Collectors.toList());	
	}
}
