package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Category;

import java.util.List;

public interface CategoryServices {
    void save(Category category);
    void update(Category category);
    Category findById(Integer id);
    List<Category> findAll();
    void delete(Integer id);
}
