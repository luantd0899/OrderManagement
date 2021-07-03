package com.company.businesslayer;

import com.company.entity.CategoryProduct;

public interface ICategoryService {
	CategoryProduct findCategoryProductById(int id);
}
