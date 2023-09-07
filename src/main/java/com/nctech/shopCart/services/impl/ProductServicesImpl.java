package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Product;
import com.nctech.shopCart.repository.ProductRepo;
import com.nctech.shopCart.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {
    @Autowired
    ProductRepo productRepo;
    @Override
    public void save(Product product) {
        productRepo.save(product);
    }
    @Override
    public void update(Product product) {
       productRepo.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return productRepo.findById(id).orElse(new Product());
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
      productRepo.deleteById(id);
    }
}
