package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.Seller;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SellerRepositoryTest {
    SellerRepo sellerRepo = new SellerRepoImpl();
    @Order(1)
    @Test
    public void testSave(){
        Seller seller = new Seller(3,"Sonya","Sonya Ingle","Khamgaon","1010");
        sellerRepo.save(seller);
        System.out.println("save successfully");
    }
    @Order(2)
    @Test
    public void testUpdate(){
        Seller seller = new Seller(2,"Sa","Tinkuu Jiya","Hatedi","9512");
        sellerRepo.update(seller);
        System.out.println("update successfully");
    }
    @Order(3)
    @Test
    public void testFindById(){
       Seller seller = sellerRepo.findById(1);
        System.out.println(seller.getId());
        System.out.println(seller.getShopName());
        System.out.println(seller.getOwnerName());
        System.out.println(seller.getAddress());
        System.out.println(seller.getMobile());
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<Seller> sellers = sellerRepo.findAll();
        sellers.forEach(seller -> System.out.println(seller.getId()+"|"+seller.getShopName()+"|"+seller.getOwnerName()
        +"|"+seller.getAddress()+"|"+seller.getMobile()) );
    }
    @Order(5)
    @Test
    public void testDelete(){
    sellerRepo.delete(3);
        System.out.println("deleted successfully");
    }
}
