package com.github.youssfbr.aulajpa.services;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.youssfbr.aulajpa.dto.CategoryDTO;
import com.github.youssfbr.aulajpa.entities.Category;
import com.github.youssfbr.aulajpa.repositories.CategoryRepository;
import com.github.youssfbr.aulajpa.services.exceptions.ResourceNotFoundException;
import com.github.youssfbr.aulajpa.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService, Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private final CategoryRepository repository;
		
	public CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		
		return repository.findAll().stream()
				.map(x-> new CategoryDTO(x)).collect(Collectors.toList());		
	}	

	@Override
	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {

		Category entity = repository
				.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Id " + id + " not found"));
		
		return new CategoryDTO(entity);
	}
}
