package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.ShipAdd;
import com.nctech.shopCart.repository.ShipAddRepo;
import com.nctech.shopCart.services.ShipAddServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipAddServicesImpl implements ShipAddServices {
    @Autowired
    ShipAddRepo shipAddRepo ;
    @Override
    public void save(ShipAdd shipAdd) {
        shipAddRepo.save(shipAdd);
    }

    @Override
    public void update(ShipAdd shipAdd) {
     shipAddRepo.save(shipAdd);
    }

    @Override
    public ShipAdd findById(Integer id) {
        return shipAddRepo.findById(id).orElse(new ShipAdd());
    }

    @Override
    public List<ShipAdd> findAll() {
        return shipAddRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
         shipAddRepo.deleteById(id);
    }
}
