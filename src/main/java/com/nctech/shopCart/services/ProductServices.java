package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Product;

import java.util.List;

public interface ProductServices {
    void save(Product product);
    void update(Product product);
    Product findById(Integer id);
    List<Product>findAll();
    void delete(Integer id);
}
