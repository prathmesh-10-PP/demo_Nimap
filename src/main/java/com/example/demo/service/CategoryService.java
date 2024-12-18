package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<Category> getAllCategories(int page);
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
