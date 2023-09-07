package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.CartItem;

import java.util.List;

public interface CartItemServices {
    void save(CartItem cartItem);
    void update(CartItem cartItem);
    CartItem findById(Integer id);
    List<CartItem>findAll();
    void delete(Integer id);
}
