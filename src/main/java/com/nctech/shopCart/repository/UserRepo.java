package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Integer> {

}
