package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.User;
import com.nctech.shopCart.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping("/")
    public void save(@RequestBody User user){
        userServices.save(user);
    }
    @GetMapping("{id}")
    public User findById(@PathVariable Integer id){
        return userServices.findById(id);
    }
    @PutMapping("/")
    public void update(@RequestBody User user){
        userServices.update(user);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        userServices.delete(id);
    }
    @GetMapping("/")
    public List<User>findAll(){
        return userServices.findAll();
    }
}
