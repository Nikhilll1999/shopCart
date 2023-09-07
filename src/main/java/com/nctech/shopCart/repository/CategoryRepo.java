package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
