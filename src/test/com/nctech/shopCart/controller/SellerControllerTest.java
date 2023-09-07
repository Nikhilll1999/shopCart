package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import com.nctech.shopCart.dto.Seller;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SellerControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    SellerController sellerController = context.getBean(SellerController.class);

    @Order(1)
    @Test
    public void testSave(){
        Seller seller = new Seller(3,"Sonya","Sonya Ingle","Khamgaon","1010");
        sellerController.save(seller);
        System.out.println("save successfully");
    }
    @Order(2)
    @Test
    public void testUpdate(){
        Seller seller = new Seller(1,"Na","YIhd Jiya","to","8800");
        sellerController.update(seller);
        System.out.println("update successfully");
    }
    @Order(3)
    @Test
    public void testFindById(){
        Seller seller = sellerController.findById(3);
        System.out.println(seller.getId());
        System.out.println(seller.getShopName());
        System.out.println(seller.getOwnerName());
        System.out.println(seller.getAddress());
        System.out.println(seller.getMobile());
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<Seller> sellers = sellerController.findAll();
        sellers.forEach(seller -> System.out.println(seller.getId()+"|"+seller.getShopName()+"|"+seller.getOwnerName()
                +"|"+seller.getAddress()+"|"+seller.getMobile()) );
    }
    @Order(5)
    @Test
    public void testDelete(){
        sellerController.delete(2);
        System.out.println("deleted successfully");
    }
}

