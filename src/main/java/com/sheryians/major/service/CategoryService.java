package com.sheryians.major.service;

import com.sheryians.major.model.Category;
import com.sheryians.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository createRepository;


    public void addCategory(Category category){
        createRepository.save(category);
    }
    public List<Category> getAllCategory(){
        return createRepository.findAll();
    }
    public void removeCategoryById(int id){
        createRepository.deleteById(id);
    }

    public Optional<Category> getCategoryById(int id){
        return createRepository.findById(id);
    }
}
