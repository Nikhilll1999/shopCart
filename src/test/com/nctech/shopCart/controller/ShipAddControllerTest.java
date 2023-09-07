package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import com.nctech.shopCart.dto.ShipAdd;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShipAddControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    ShipAddController shipAddController = context.getBean(ShipAddController.class);
    @Order(1)
    @Test
    public void testSave(){
        ShipAdd shipAdd = new ShipAdd(1,"nicolas PANDYA","WI","Tobaggo");
        shipAddController.save(shipAdd);
        System.out.println("Saved Successfully");
    }
    @Order(2)
    @Test
    public void testFindById( ){
        ShipAdd shipAdd = shipAddController.findById(2);
        System.out.println(shipAdd.getId());
        System.out.println(shipAdd.getFullName());
        System.out.println(shipAdd.getAddress());
        System.out.println(shipAdd.getCity());
    }
    @Order(3)
    @Test
    public void testUpdate(){
        ShipAdd shipAdd = new ShipAdd(2,"ABCD","XYZ","123");
        shipAddController.update(shipAdd);
        System.out.println("Update Successfully");
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<ShipAdd> shipAdds = shipAddController.findAll();
        shipAdds.forEach(shipAdd -> System.out.println(shipAdd.getId()+"|"+
                shipAdd.getFullName()+"|"+shipAdd.getAddress()+"|"+shipAdd.getCity()) );
    }
    @Order(5)
    @Test
    public void testDelete(){
        shipAddController.delete(2);
        System.out.println("Category deleted successfully!");
    }
    }

