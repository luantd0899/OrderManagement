package com.company.businesslayer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.businesslayer.ICategoryService;
import com.company.datalayer.ICategoryRepository;
import com.company.entity.CategoryProduct;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private ICategoryRepository repository;
	
	@Override
	public CategoryProduct findCategoryProductById(int id) {
		return repository.findById(id).get();
	}

}
