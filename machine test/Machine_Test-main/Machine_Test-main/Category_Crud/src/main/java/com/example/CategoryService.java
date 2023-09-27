package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category updateCategory(Long id, Category updatedCategory) {
        if (categoryRepository.existsById(id)) {
            updatedCategory.setId(id);
            return categoryRepository.save(updatedCategory);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
