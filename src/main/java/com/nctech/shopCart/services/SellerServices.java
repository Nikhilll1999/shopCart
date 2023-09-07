package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Seller;

import java.util.List;

public interface SellerServices {
    void save(Seller seller);
    List<Seller> findAll();
    Seller findById(Integer id);
    void update(Seller Seller);
    void delete(Integer id);
}

