package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Address;

import java.util.List;

public interface AddressServices {
    void save(Address address);
    void update(Address address);
    Address findByID(Integer id);
    List<Address>findAll();
    void delete(Integer id);
}
