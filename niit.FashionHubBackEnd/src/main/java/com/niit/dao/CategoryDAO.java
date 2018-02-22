package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {

		public List<Category> viewCategory();

		public boolean saveCategory(Category c);
		
		public void editCategory(String category_id);
		
		public boolean deleteCategory(String category_id);
		
		public Category getCategoryById(String category_id);
		
		public boolean updateCategory(Category c);
	}
