package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    CategoryController categoryController = context.getBean(CategoryController.class);

    @Order(1)
    @Test
    public void testSave(){
        Category category = new Category(4,"SPORTS","S101");
        categoryController.save(category);
        System.out.println("Category saved successfully!");
    }
    @Order(2)
    @Test
    public void testFindById(){
        Category category = categoryController.findById(4);
        System.out.println(category.getId());
        System.out.println(category.getName());
        System.out.println(category.getCode());
    }
    @Order(3)
    @Test
    public void testUpdate(){
        Category category = new Category(2,"COSMETICS","C101");
        categoryController.update(category);
        System.out.println("Category updated successfully!!!!");
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<Category> categories = categoryController.findAll();
        categories.forEach(category -> System.out.println(category.getId()+"|"+
                category.getName()+"|"+category.getCode()) );
    }
    @Order(5)
    @Test
    public void testDelete(){
        categoryController.delete(3);
        System.out.println("Category deleted successfully!");
    }
}
