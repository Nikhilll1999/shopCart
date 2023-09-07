package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Address;
import com.nctech.shopCart.repository.AddressRepo;
import com.nctech.shopCart.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServicesImpl implements AddressServices {
    @Autowired
   private AddressRepo addressRepo;
    @Override
    public void save(Address address) {
       addressRepo.save(address);
    }

    @Override
    public void update(Address address) {
      addressRepo.save(address);
    }

    @Override
    public Address findByID(Integer id) {
        return addressRepo.findById(id).orElse(new Address());
    }

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
      addressRepo.deleteById(id);
    }
}
