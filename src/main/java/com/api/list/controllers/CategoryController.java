package com.api.list.controllers;

import com.api.list.models.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.list.repositories.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
	
	@Autowired
    private CategoryRepository categoryRepository;
	
	@GetMapping
    public List<Category> list() {
        return categoryRepository.findAll();
    }

}
