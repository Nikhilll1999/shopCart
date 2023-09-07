package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Seller;
import com.nctech.shopCart.repository.SellerRepo;
import com.nctech.shopCart.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServicesImpl implements SellerServices {
    @Autowired
   private SellerRepo sellerRepo ;
    @Override
    public void save(Seller seller) {
        sellerRepo.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepo.findAll();
    }

    @Override
    public Seller findById(Integer id) {
        return sellerRepo.findById(id).orElse(new Seller());
    }

    @Override
    public void update(Seller seller) {
        sellerRepo.save(seller);
    }

    @Override
    public void delete(Integer id) {
        sellerRepo.deleteById(id);
    }
}
