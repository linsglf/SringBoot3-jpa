package com.cursojava.spring.services;

import com.cursojava.spring.entities.Category;
import com.cursojava.spring.repositories.CategoryRepository;
import com.cursojava.spring.resources.CategoryResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).get();
    }
}
