package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Category;
import com.nctech.shopCart.repository.CategoryRepo;
import com.nctech.shopCart.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServicesImpl implements CategoryServices {
    @Autowired
   private CategoryRepo categoryRepo;
    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void update(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public Category findById(Integer id) {
        return categoryRepo.findById(id).orElse(new Category());
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
         categoryRepo.deleteById(id);
    }
}
