package com.github.youssfbr.aulajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.youssfbr.aulajpa.entities.Category;
import com.github.youssfbr.aulajpa.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private final CategoryRepository repository;
		
	public CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
	
	public List<Category> findAll() {
		return repository.findAll();
	}
}
