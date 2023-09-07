package com.nctech.shopCart.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryRepositoryTest {
    CategoryRepo categoryRepo = new CategoryRepoImpl();
   @Order(1)
    @Test
    public void testSave(){
        Category category = new Category(2,"Fruits","F101");
        categoryRepo.save(category);
       System.out.println("Category saved successfully!");
    }
    @Order(2)
    @Test
    public void testFindById(){
        Category category = categoryRepo.findById(4);
        System.out.println(category.getId());
        System.out.println(category.getName());
        System.out.println(category.getCode());
    }
    @Order(3)
    @Test
    public void testUpdate(){
        Category category = new Category(1,"Dragon","D101");
        categoryRepo.update(category);
        System.out.println("Category updated successfully!!!!");
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<Category> categories = categoryRepo.findAll();
        categories.forEach(category -> System.out.println(category.getId()+"|"+
                category.getName()+"|"+category.getCode()) );
    }
    @Order(5)
    @Test
    public void testDelete(){
        categoryRepo.delete(4);
        System.out.println("Category deleted successfully!");
}

}
