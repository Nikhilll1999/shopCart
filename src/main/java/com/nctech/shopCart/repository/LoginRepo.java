package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,Integer> {

}
