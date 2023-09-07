package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Product;
import com.nctech.shopCart.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServices productServices;
    @PostMapping("/")
    public void save(@RequestBody Product product){
        productServices.save(product);
    }
    @PutMapping("/")
    public void update(@RequestBody Product product){
        productServices.update(product);
    }
    @GetMapping("{id}")
    public Product findById(@PathVariable Integer id){
       return productServices.findById(id);
    }
    @GetMapping("/")
    public List<Product>findAll(){
        return productServices.findAll();
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        productServices.delete(id);
    }

}
