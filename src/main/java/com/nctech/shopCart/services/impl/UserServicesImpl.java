package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.User;
import com.nctech.shopCart.repository.UserRepo;
import com.nctech.shopCart.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRepo userRepo;
    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepo.findById(id).orElse(new User());
    }

    @Override
    public void update(User user) {
       userRepo.save(user);
    }

    @Override
    public void delete(Integer id) {
         userRepo.deleteById(id);
    }
}
