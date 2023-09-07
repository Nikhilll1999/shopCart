package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.ShipAdd;

import java.util.List;

public interface ShipAddServices {
    void save(ShipAdd shipAdd);
    void update(ShipAdd shipAdd);
    ShipAdd findById(Integer id);
    List<ShipAdd>findAll();
    void delete(Integer id);
}
