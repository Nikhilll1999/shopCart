package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Login;
import com.nctech.shopCart.repository.LoginRepo;
import com.nctech.shopCart.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServicesImpl implements LoginServices {
    @Autowired
    private LoginRepo loginRepo;
    @Override
    public void save(Login login) {
        loginRepo.save(login);
    }

    @Override
    public void update(Login login) {
      loginRepo.save(login);
    }

    @Override
    public Login findById(Integer id) {
        return loginRepo.findById(id).orElse(new Login());
    }

    @Override
    public List<Login> findAll() {
        return loginRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
       loginRepo.deleteById(id);
    }
}
