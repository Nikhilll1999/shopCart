package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Login;
import com.nctech.shopCart.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
   private LoginServices loginServices ;

    @PostMapping("/")
    public void save(@RequestBody Login login){
       loginServices.save(login);
    }
    @PutMapping("/")
    public void update(@RequestBody Login login){
        loginServices.update(login);
    }
    @GetMapping("{id}")
    public Login findById(@PathVariable Integer id){
       return loginServices.findById(id);
    }
    @GetMapping("/")
    public List<Login>findAll(){
        return loginServices.findAll();
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        loginServices.delete(id);
    }
}
