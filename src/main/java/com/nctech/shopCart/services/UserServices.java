package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.User;

import java.util.List;

public interface UserServices {
    void save(User user);
    List<User>findAll();
    User findById(Integer id);
    void update(User user);
    void delete(Integer id);
}
