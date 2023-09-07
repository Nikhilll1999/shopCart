package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Category;
import com.nctech.shopCart.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServices categoryServices;
    @PostMapping("/")
    public void save(@RequestBody Category category){
        categoryServices.save(category);
    }
    @PutMapping("/")
    public void update(@RequestBody Category category){
        categoryServices.update(category);
    }
    @GetMapping("{id}")
    public Category findById(@PathVariable Integer id){
       return categoryServices.findById(id);
    }
    @GetMapping("/")
    public List<Category> findAll(){
       return categoryServices.findAll();
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        categoryServices.delete(id);
    }
}
