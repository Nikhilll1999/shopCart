package com.nctech.shopCart.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ProductRepositoryTest {
    ProductRepo productRepo = new ProductRepoImpl();

    @Order(1)
    @Test
    public void testSave(){
        Product product = new Product(5,"RED","120",120,800.00);
        productRepo.save(product);
        System.out.println("Product saved successfully");
    }
    @Order(2)
    @Test
    public void testFindById(){
        Product product = productRepo.findById(3);
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getCode());
        System.out.println(product.getCategoryId());
        System.out.println(product.getPrice());
    }
    @Order(3)
    @Test
    public void testUpdate(){
        Product product = new Product(1,"WHITE","351",20,200.00);
        productRepo.update(product);
        System.out.println("Product updated successfully");
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<Product> products = productRepo.findAll();
        products.forEach(product -> System.out.println(product.getId()+"|"+product.getName()));
    }
    @Order(5)
    @Test
    public void testDelete(){
      productRepo.delete(2);
        System.out.println("Product deleted successfully");
    }

}
