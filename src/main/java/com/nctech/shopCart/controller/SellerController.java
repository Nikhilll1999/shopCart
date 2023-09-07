package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Seller;
import com.nctech.shopCart.services.SellerServices;
import com.nctech.shopCart.services.impl.SellerServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
   private SellerServices sellerServices ;

    @PostMapping("/")
    public void save(@RequestBody Seller seller){
        sellerServices.save(seller);
    }
    @GetMapping("{id}")
    public Seller findById(@PathVariable Integer id){
        return sellerServices.findById(id);
    }
    @PutMapping("/")
    public void update(@RequestBody Seller seller){
        sellerServices.update(seller);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        sellerServices.delete(id);
    }
    @GetMapping("/")
    public List<Seller> findAll(){
        return sellerServices.findAll();
    }
}
