package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.CartItem;
import com.nctech.shopCart.repository.CartItemRepo;
import com.nctech.shopCart.services.CartItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServicesImpl implements CartItemServices {
    @Autowired
    CartItemRepo cartItemRepo;
    @Override
    public void save(CartItem cartItem) {
        cartItemRepo.save(cartItem);
    }

    @Override
    public void update(CartItem cartItem) {
           cartItemRepo.save(cartItem);
    }

    @Override
    public CartItem findById(Integer id) {
        return cartItemRepo.findById(id).orElse(new CartItem());
    }

    @Override
    public List<CartItem> findAll() {
        return cartItemRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
       cartItemRepo.deleteById(id);
    }
}
