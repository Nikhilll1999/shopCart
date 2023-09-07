package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
    ProductController productController = context.getBean(ProductController.class);
        @Order(1)
        @Test
        public void testSave(){
            Product product = new Product(50,"REDBALL","400",120,800.00);
            productController.save(product);
            System.out.println("Product saved successfully");
        }
        @Order(2)
        @Test
        public void testFindById(){
            Product product = productController.findById(2);
            System.out.println(product.getId());
            System.out.println(product.getName());
            System.out.println(product.getCode());
            System.out.println(product.getCategoryId());
            System.out.println(product.getPrice());
        }
        @Order(3)
        @Test
        public void testUpdate(){
            Product product = new Product(4,"GOLO","300",200,2000.00);
            productController.update(product);
            System.out.println("Product updated successfully");
        }
        @Order(4)
        @Test
        public void testFindAll(){
            List<Product> products = productController.findAll();
            products.forEach(product -> System.out.println(product.getId()+"|"+product.getName()));
        }
        @Order(5)
        @Test
        public void testDelete(){
            productController.delete(1);
            System.out.println("Product deleted successfully");
        }

    }

