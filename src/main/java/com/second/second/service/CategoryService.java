package com.second.second.service;

import com.second.second.model.Category;
import com.second.second.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    public void createCategory(Category category) {
        categoryRepo.save(category);
    }
}
