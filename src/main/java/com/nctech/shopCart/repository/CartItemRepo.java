package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
}
